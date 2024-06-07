package com.jagex.js5.caching;

import com.jagex.core.datastruct.SecondaryLinkedList;
import com.jagex.core.utils.JagException;
import com.jagex.game.client.DiskStore;
import com.jagex.js5.worker.Js5WorkerRequest;


public class Js5DiskCache implements Runnable {

    public SecondaryLinkedList queue = new SecondaryLinkedList();

    public int pendingRequests = 0;

    public boolean stop = false;

    public Thread thread = new Thread(this);

	public Js5DiskCache() {
		this.thread.setDaemon(true);
		this.thread.start();
		this.thread.setPriority(1);
	}

    public Js5WorkerRequest readSynchronous(int arg0, DiskStore arg1) {
		Js5WorkerRequest var3 = new Js5WorkerRequest();
		var3.type = 1;
		SecondaryLinkedList var4 = this.queue;
		synchronized (this.queue) {
			Js5WorkerRequest other = (Js5WorkerRequest) this.queue.peekFront();
			while (true) {
				if (other == null) {
					break;
				}
				if (other.secondaryNodeId == (long) arg0 && other.diskStore == arg1 && other.type == 2) {
					var3.bytes = other.bytes;
					var3.incomplete = false;
					return var3;
				}
				other = (Js5WorkerRequest) this.queue.prev();
			}
		}
		var3.bytes = arg1.read(arg0);
		var3.incomplete = false;
		var3.urgent = true;
		return var3;
	}

    public Js5WorkerRequest write(int arg0, byte[] arg1, DiskStore arg2) {
		Js5WorkerRequest var4 = new Js5WorkerRequest();
		var4.type = 2;
		var4.secondaryNodeId = arg0;
		var4.bytes = arg1;
		var4.diskStore = arg2;
		var4.urgent = false;
		this.queueRequest(var4);
		return var4;
	}

    public Js5WorkerRequest read(int arg0, DiskStore arg1) {
		Js5WorkerRequest var3 = new Js5WorkerRequest();
		var3.type = 3;
		var3.secondaryNodeId = arg0;
		var3.diskStore = arg1;
		var3.urgent = false;
		this.queueRequest(var3);
		return var3;
	}

    public void queueRequest(Js5WorkerRequest arg0) {
		SecondaryLinkedList var2 = this.queue;
		synchronized (this.queue) {
			this.queue.pushBack(arg0);
			this.pendingRequests++;
			this.queue.notifyAll();
		}
	}

	public void run() {
		while (!this.stop) {
			SecondaryLinkedList var1 = this.queue;
			Js5WorkerRequest var2;
			synchronized (this.queue) {
				var2 = (Js5WorkerRequest) this.queue.pollFront();
				if (var2 == null) {
					try {
						this.queue.wait();
					} catch (InterruptedException var7) {
					}
					continue;
				}
				this.pendingRequests--;
			}
			try {
				if (var2.type == 2) {
					var2.diskStore.method9011((int) var2.secondaryNodeId, var2.bytes, var2.bytes.length);
				} else if (var2.type == 3) {
					var2.bytes = var2.diskStore.read((int) var2.secondaryNodeId);
				}
			} catch (Exception var6) {
				JagException.report(null, var6);
			}
			var2.incomplete = false;
		}
	}

    public int getPendingRequests() {
		SecondaryLinkedList var1 = this.queue;
		synchronized (this.queue) {
			return this.pendingRequests;
		}
	}

    public void quit() {
		this.stop = true;
		SecondaryLinkedList var1 = this.queue;
		synchronized (this.queue) {
			this.queue.notifyAll();
		}
		try {
			this.thread.join();
		} catch (InterruptedException var4) {
		}
		this.thread = null;
	}
}

package rs2.client.logic.clans;

import com.jagex.core.datastruct.LinkList;
import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

public class ClanChannelDelta {

    public long clanHash;

    public long updateNum = -1L;

    public LinkList queue = new LinkList();

	public ClanChannelDelta(Packet buf) {
		this.decode(buf);
	}

    public void decode(Packet buf) {
		this.clanHash = buf.g8();
		this.updateNum = buf.g8();
		for (int code = buf.g1(); code != 0; code = buf.g1()) {
			ClanChannelDeltaEntry entry;
			if (code == 1) {
				entry = new AddUser(this);
			} else if (code == 4) {
				entry = new UpdateBaseSettings(this);
			} else if (code == 3) {
				entry = new DeleteUser(this);
			} else if (code == 2) {
				entry = new UpdateUserDetails(this);
			} else if (code == 5) {
				entry = new UpdateUserDetailsV2(this);
			} else {
				throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
			}
			entry.decode(buf);
			this.queue.addTail(entry);
		}
	}

	// line 40
    public void applyToClanChannel(ClanChannel clanChannel) {
		if (this.clanHash != clanChannel.nodeId || this.updateNum != clanChannel.updateNum) {
            // throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + dr574.bq + " updateNum:" + dr574.n + " delta.clanHash:" + this.g + " updateNum:" + this.d);
			throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match!");
		}
		for (ClanChannelDeltaEntry entry = (ClanChannelDeltaEntry) this.queue.head(); entry != null; entry = (ClanChannelDeltaEntry) this.queue.next()) {
			entry.apply(clanChannel);
		}
		clanChannel.updateNum++;
	}

    public static class AddUser extends ClanChannelDeltaEntry {

		// $FF: synthetic field
		public final ClanChannelDelta this$0;

        public String membername;

        public int memberworld;

        public byte memberrank;

		// line 58
		public AddUser(ClanChannelDelta arg0) {
			this.this$0 = arg0;
			this.membername = null;
		}

        public void decode(Packet buf) {
			if (buf.g1() != 255) {
				buf.pos -= 1;
				buf.g8();
			}
			this.membername = buf.fastgstr();
			this.memberworld = buf.g2();
			this.memberrank = buf.g1b();
			buf.g8();
		}

        public void apply(ClanChannel channel) {
			ClanChannelUser user = new ClanChannelUser();
			user.name = this.membername;
			user.world = this.memberworld;
			user.rank = this.memberrank;
			channel.doAddUser(user);
		}
	}

    public static class DeleteUser extends ClanChannelDeltaEntry {

		// $FF: synthetic field
		public final ClanChannelDelta this$0;

        public int pos;

		// line 83
		public DeleteUser(ClanChannelDelta arg0) {
			this.this$0 = arg0;
			this.pos = -1;
		}

        public void decode(Packet buf) {
			this.pos = buf.g2();
			buf.g1();
			if (buf.g1() != 255) {
				buf.pos -= 1;
				buf.g8();
			}
		}

        public void apply(ClanChannel channel) {
			channel.doDeleteUser(this.pos);
		}
	}

    public static class UpdateUserDetails extends ClanChannelDeltaEntry {

		// $FF: synthetic field
		public final ClanChannelDelta this$0;

        public int field12252;

        public byte memberrank;

        public int memberworld;

        public String membername;

		// line 105
		public UpdateUserDetails(ClanChannelDelta arg0) {
			this.this$0 = arg0;
			this.field12252 = -1;
		}

        public void decode(Packet buf) {
			this.field12252 = buf.g2();
			this.memberrank = buf.g1b();
			this.memberworld = buf.g2();
			buf.g8();
			this.membername = buf.gjstr();
		}

        public void apply(ClanChannel channel) {
			ClanChannelUser var2 = channel.channelUsers[this.field12252];
			var2.rank = this.memberrank;
			var2.world = this.memberworld;
			var2.name = this.membername;
		}
	}

    public static class UpdateUserDetailsV2 extends ClanChannelDeltaEntry {

		// $FF: synthetic field
		public final ClanChannelDelta this$0;

        public int pos;

        public byte memberrank;

        public int memberworld;

        public String membername;

		// line 129
		public UpdateUserDetailsV2(ClanChannelDelta arg0) {
			this.this$0 = arg0;
			this.pos = -1;
		}

        public void decode(Packet buf) {
			buf.g1();
			this.pos = buf.g2();
			this.memberrank = buf.g1b();
			this.memberworld = buf.g2();
			buf.g8();
			this.membername = buf.gjstr();
			buf.g1();
		}

        public void apply(ClanChannel channel) {
			ClanChannelUser user = channel.channelUsers[this.pos];
			user.rank = this.memberrank;
			user.world = this.memberworld;
			user.name = this.membername;
		}
	}

    public static class UpdateBaseSettings extends ClanChannelDeltaEntry {

		// $FF: synthetic field
		public final ClanChannelDelta this$0;

        public String clanName;

        public byte rankTalk;

        public byte rankKick;

		// line 154
		public UpdateBaseSettings(ClanChannelDelta arg0) {
			this.this$0 = arg0;
		}

        public void decode(Packet buf) {
			this.clanName = buf.fastgstr();
			if (this.clanName != null) {
				buf.g1();
				this.rankTalk = buf.g1b();
				this.rankKick = buf.g1b();
			}
		}

        public void apply(ClanChannel channel) {
			channel.clanName = this.clanName;
			if (this.clanName != null) {
				channel.rankTalk = this.rankTalk;
				channel.rankKick = this.rankKick;
			}
		}
	}
}

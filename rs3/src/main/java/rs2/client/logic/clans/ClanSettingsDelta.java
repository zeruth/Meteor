package rs2.client.logic.clans;

import com.jagex.core.datastruct.LinkList;
import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

public class ClanSettingsDelta {

    public long ownerHash;

    public int updateNum = -1;

    public LinkList queue = new LinkList();

	public ClanSettingsDelta(Packet buf) {
		this.decode(buf);
	}

    public void decode(Packet buf) {
		this.ownerHash = buf.g8();
		this.updateNum = buf.g4s();
		for (int code = buf.g1(); code != 0; code = buf.g1()) {
			ClanSettingsDeltaEntry entry;
			if (code == 3) {
				entry = new AddBanned(this);
			} else if (code == 1) {
				entry = new AddMemberV1(this);
			} else if (code == 13) {
				entry = new AddMemberV2(this);
			} else if (code == 4) {
				entry = new UpdateBaseSettings(this);
			} else if (code == 6) {
				entry = new DeleteBanned(this);
			} else if (code == 5) {
				entry = new DeleteMember(this);
			} else if (code == 2) {
				entry = new SetMemberRank(this);
			} else if (code == 7) {
				entry = new SetMemberExtraInfo(this);
			} else if (code == 14) {
				entry = new SetMemberMuted(this);
			} else if (code == 8) {
				entry = new SetExtraSettingInt(this);
			} else if (code == 9) {
				entry = new SetExtraSettingLong(this);
			} else if (code == 10) {
				entry = new SetExtraSettingString(this);
			} else if (code == 11) {
				entry = new SetExtraSettingVarbit(this);
			} else if (code == 12) {
				entry = new SetClanName(this);
			} else {
				throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
			}
			entry.decode(buf);
			this.queue.addTail(entry);
		}
	}

	// line 58
    public void applyToClanSettings(ClanSettings settings) {
		if (this.ownerHash != settings.owner || this.updateNum != settings.updateNum) {
            // throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + Q280.g(ef450.h) + " updateNum:" + ef450.s + " delta.owner:" + Q280.g(this.g) + " updateNum:" + this.d);
			throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match!");
		}
		for (ClanSettingsDeltaEntry entry = (ClanSettingsDeltaEntry) this.queue.head(); entry != null; entry = (ClanSettingsDeltaEntry) this.queue.next()) {
			entry.apply(settings);
		}
		settings.updateNum++;
	}

    public static class AddMemberV1 extends ClanSettingsDeltaEntry {

		// $FF: synthetic field
		public final ClanSettingsDelta this$0;

        public long userhash;

        public String displayname;

		// line 75
		public AddMemberV1(ClanSettingsDelta arg0) {
			this.this$0 = arg0;
			this.userhash = -1L;
			this.displayname = null;
		}

        public void decode(Packet buf) {
			if (buf.g1() != 255) {
				buf.pos -= 1;
				this.userhash = buf.g8();
			}
			this.displayname = buf.fastgstr();
		}

        public void apply(ClanSettings settings) {
			settings.doAddMember(this.userhash, this.displayname, 0);
		}
	}

    public static class AddMemberV2 extends ClanSettingsDeltaEntry {

		// $FF: synthetic field
		public final ClanSettingsDelta this$0;

        public long userhash;

        public String displayname;

        public int joinedRunedays;

		// line 95
		public AddMemberV2(ClanSettingsDelta arg0) {
			this.this$0 = arg0;
			this.userhash = -1L;
			this.displayname = null;
			this.joinedRunedays = 0;
		}

        public void decode(Packet buf) {
			if (buf.g1() != 255) {
				buf.pos -= 1;
				this.userhash = buf.g8();
			}
			this.displayname = buf.fastgstr();
			this.joinedRunedays = buf.g2();
		}

        public void apply(ClanSettings settings) {
			settings.doAddMember(this.userhash, this.displayname, this.joinedRunedays);
		}
	}

    public static class DeleteMember extends ClanSettingsDeltaEntry {

		// $FF: synthetic field
		public final ClanSettingsDelta this$0;

        public int pos;

		// line 114
		public DeleteMember(ClanSettingsDelta arg0) {
			this.this$0 = arg0;
			this.pos = -1;
		}

        public void decode(Packet buf) {
			this.pos = buf.g2();
		}

        public void apply(ClanSettings settings) {
			settings.doDeleteMember(this.pos);
		}
	}

    public static class SetMemberRank extends ClanSettingsDeltaEntry {

		// $FF: synthetic field
		public final ClanSettingsDelta this$0;

        public int pos;

        public byte rank;

		// line 129
		public SetMemberRank(ClanSettingsDelta arg0) {
			this.this$0 = arg0;
			this.pos = -1;
		}

        public void decode(Packet buf) {
			this.pos = buf.g2();
			this.rank = buf.g1b();
		}

        public void apply(ClanSettings settings) {
			settings.doSetMemberRank(this.pos, this.rank);
		}
	}

    public static class SetMemberExtraInfo extends ClanSettingsDeltaEntry {

		// $FF: synthetic field
		public final ClanSettingsDelta this$0;

        public int pos;

        public int field12226;

        public int field12227;

        public int field12228;

		// line 147
		public SetMemberExtraInfo(ClanSettingsDelta arg0) {
			this.this$0 = arg0;
			this.pos = -1;
		}

        public void decode(Packet buf) {
			this.pos = buf.g2();
			this.field12226 = buf.g4s();
			this.field12227 = buf.g1();
			this.field12228 = buf.g1();
		}

        public void apply(ClanSettings settings) {
			settings.doSetMemberExtraInfo(this.pos, this.field12226, this.field12227, this.field12228);
		}
	}

    public static class SetMemberMuted extends ClanSettingsDeltaEntry {

		// $FF: synthetic field
		public final ClanSettingsDelta this$0;

        public int pos;

        public boolean muted;

		// line 165
		public SetMemberMuted(ClanSettingsDelta arg0) {
			this.this$0 = arg0;
			this.pos = -1;
		}

        public void decode(Packet buf) {
			this.pos = buf.g2();
			this.muted = buf.g1() == 1;
		}

        public void apply(ClanSettings settings) {
			settings.doSetMemberMuted(this.pos, this.muted);
		}
	}

    public static class AddBanned extends ClanSettingsDeltaEntry {

		// $FF: synthetic field
		public final ClanSettingsDelta this$0;

        public long userhash;

        public String displayname;

		// line 181
		public AddBanned(ClanSettingsDelta arg0) {
			this.this$0 = arg0;
			this.userhash = -1L;
			this.displayname = null;
		}

        public void decode(Packet buf) {
			if (buf.g1() != 255) {
				buf.pos -= 1;
				this.userhash = buf.g8();
			}
			this.displayname = buf.fastgstr();
		}

        public void apply(ClanSettings settings) {
			settings.doAddBanned(this.userhash, this.displayname);
		}
	}

    public static class DeleteBanned extends ClanSettingsDeltaEntry {

		// $FF: synthetic field
		public final ClanSettingsDelta this$0;

        public int pos;

		// line 199
		public DeleteBanned(ClanSettingsDelta arg0) {
			this.this$0 = arg0;
			this.pos = -1;
		}

        public void decode(Packet buf) {
			this.pos = buf.g2();
		}

        public void apply(ClanSettings settings) {
			settings.doDeleteBanned(this.pos);
		}
	}

    public static class SetClanName extends ClanSettingsDeltaEntry {

		// $FF: synthetic field
		public final ClanSettingsDelta this$0;

        public String clanName;

		// line 213
		public SetClanName(ClanSettingsDelta arg0) {
			this.this$0 = arg0;
		}

        public void decode(Packet buf) {
			this.clanName = buf.gjstr();
			buf.g4s();
		}

        public void apply(ClanSettings settings) {
			settings.clanName = this.clanName;
		}
	}

    public static class UpdateBaseSettings extends ClanSettingsDeltaEntry {

		// $FF: synthetic field
		public final ClanSettingsDelta this$0;

        public boolean allowUnaffined;

        public byte rankTalk;

        public byte rankKick;

        public byte rankLootshare;

        public byte coinshare;

		// line 232
		public UpdateBaseSettings(ClanSettingsDelta arg0) {
			this.this$0 = arg0;
		}

        public void decode(Packet buf) {
			this.allowUnaffined = buf.g1() == 1;
			this.rankTalk = buf.g1b();
			this.rankKick = buf.g1b();
			this.rankLootshare = buf.g1b();
			this.coinshare = buf.g1b();
		}

        public void apply(ClanSettings settings) {
			settings.allowUnaffined = this.allowUnaffined;
			settings.rankTalk = this.rankTalk;
			settings.rankKick = this.rankKick;
			settings.rankLootshare = this.rankLootshare;
			settings.coinshare = this.coinshare;
		}
	}

    public static class SetExtraSettingInt extends ClanSettingsDeltaEntry {

		// $FF: synthetic field
		public final ClanSettingsDelta this$0;

        public int uid;

        public int setting;

		// line 255
		public SetExtraSettingInt(ClanSettingsDelta arg0) {
			this.this$0 = arg0;
		}

        public void decode(Packet buf) {
			this.uid = buf.g4s();
			this.setting = buf.g4s();
		}

        public void apply(ClanSettings settings) {
			settings.doExtraSettingInt(this.uid, this.setting);
		}
	}

    public static class SetExtraSettingVarbit extends ClanSettingsDeltaEntry {

		// $FF: synthetic field
		public final ClanSettingsDelta this$0;

        public int uid;

        public int field12246;

        public int field12247;

        public int field12248;

		// line 273
		public SetExtraSettingVarbit(ClanSettingsDelta arg0) {
			this.this$0 = arg0;
		}

        public void decode(Packet buf) {
			this.uid = buf.g4s();
			this.field12248 = buf.g4s();
			this.field12246 = buf.g1();
			this.field12247 = buf.g1();
		}

        public void apply(ClanSettings settings) {
			settings.doExtraSettingVarbit(this.uid, this.field12248, this.field12246, this.field12247);
		}
	}

    public static class SetExtraSettingLong extends ClanSettingsDeltaEntry {

		// $FF: synthetic field
		public final ClanSettingsDelta this$0;

        public int uid;

        public long setting;

		// line 291
		public SetExtraSettingLong(ClanSettingsDelta arg0) {
			this.this$0 = arg0;
		}

        public void decode(Packet buf) {
			this.uid = buf.g4s();
			this.setting = buf.g8();
		}

        public void apply(ClanSettings settings) {
			settings.doExtraSettingLong(this.uid, this.setting);
		}
	}

    public static class SetExtraSettingString extends ClanSettingsDeltaEntry {

		// $FF: synthetic field
		public final ClanSettingsDelta this$0;

        public int uid;

        public String setting;

		// line 307
		public SetExtraSettingString(ClanSettingsDelta arg0) {
			this.this$0 = arg0;
		}

        public void decode(Packet buf) {
			this.uid = buf.g4s();
			this.setting = buf.gjstr();
		}

        public void apply(ClanSettings settings) {
			settings.doExtraSettingString(this.uid, this.setting);
		}
	}
}

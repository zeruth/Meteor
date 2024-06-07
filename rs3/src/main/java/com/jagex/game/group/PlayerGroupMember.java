package com.jagex.game.group;

import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.VarValue;
import com.jagex.game.config.vartype.VarContainerSparse;
import com.jagex.game.world.entity.PlayerStat;


import java.util.Iterator;

public class PlayerGroupMember {

    public final long groupUid;

    public final PlayerStat[] stats;

    public final VarContainerSparse vars;

    public boolean members;

    public String displayName;

    public int nodeId;

    public boolean online;

    public int rank;

    public PlayerGroupMemberStatus status;

    public int team;

    public VarContainerSparse variables;

	public PlayerGroupMember(Packet buf, boolean hasUid, boolean hasDisplayName, PlayerGroupResourceProvider groupResourceProvider) {
		if (hasUid) {
			this.groupUid = buf.g8();
		} else {
			this.groupUid = -1L;
		}
		if (hasDisplayName) {
			this.displayName = buf.fastgstr();
		}
		int info = buf.g1();
		this.members = (info & 0x1) != 0;
		this.online = (info & 0x2) != 0;
		this.stats = new PlayerStat[groupResourceProvider.getSkillDefaults().getSkillCount()];
		int var6 = buf.g1();
		if (var6 > this.stats.length) {
			throw new IllegalStateException("");
		}
		for (int index = 0; index < this.stats.length; index++) {
			PlayerStat stat = this.stats[index] = new PlayerStat(groupResourceProvider.getSkillDefaults().getSkill(index), true);
			if (index < var6) {
				stat.setXP(buf.g4s());
			} else {
				stat.setXP(0);
			}
			stat.setLevel(stat.getXPLevel());
		}
		int varsCount = buf.g2();
		this.vars = new VarContainerSparse(groupResourceProvider.getVarPlayerTypeList());
		for (int index = 0; index < varsCount; index++) {
			VarValue varValue = groupResourceProvider.getVarPlayerTypeList().decodeVarValue(buf);
			this.vars.setVarValue(varValue.var, varValue.value);
		}
		this.nodeId = buf.g2();
		if (this.nodeId == 65535) {
			this.nodeId = -1;
		}
		this.rank = buf.g1();
		this.status = (PlayerGroupMemberStatus) SerializableEnums.decode(PlayerGroupMemberStatus.values(), buf.g1());
		this.team = buf.g1();
	}

    public String getDisplayName() {
		return this.displayName;
	}

    public int getRank() {
		return this.rank;
	}

    public void setRank(int rank) {
		this.rank = rank;
	}

    public int getNodeId() {
		return this.nodeId;
	}

    public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}

    public boolean isOnline() {
		return this.online;
	}

    public void setOnline(boolean online) {
		this.online = online;
	}

    public PlayerGroupMemberStatus getStatus() {
		return this.status;
	}

    public void setStatus(PlayerGroupMemberStatus status) {
		this.status = status;
	}

    public int getTeam() {
		return this.team;
	}

    public void setTeam(int team) {
		this.team = team;
	}

    public long uid() {
		return this.groupUid;
	}

    public boolean isMembers() {
		return this.members;
	}

    public PlayerStat getStat(int stat) {
		return this.stats[stat];
	}

    public void update(PlayerGroupMember arg0) {
		for (int var2 = 0; var2 < this.stats.length; var2++) {
			this.stats[var2].setXP(arg0.stats[var2].getXP());
			this.stats[var2].setLevel(this.stats[var2].getXPLevel());
		}
		this.vars.clear();
		Iterator var3 = arg0.vars.iterator();
		while (var3.hasNext()) {
			VarValue var4 = (VarValue) var3.next();
			this.vars.setVarValue(var4.var, var4.value);
		}
		this.members = arg0.members;
	}

    public void resetVariables(PlayerGroupResourceProvider arg0) {
		if (this.variables == null) {
			this.variables = new VarContainerSparse(arg0.getVarPlayerTypeList());
		} else {
			this.variables.clear();
		}
	}

    public VarContainerSparse clearVariables() {
		return this.variables;
	}
}

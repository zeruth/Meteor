package net.runelite.api;

public enum Skill {
    ATTACK(0),

    STRENGTH(2),
    HITPOINTS(3),
    RANGED(4),
    PRAYER(5),
    MAGIC(6),
    COOKING(7),
    WOODCUTTING(8),

    FISHING(10),
    FIREMAKING(11),

    SMITHING(13),
    MINING(14),


    THIEVING(17);


    public int id;
    public String name;

    Skill(int id) {
        this.id = id;
        this.name = name().toLowerCase();
    }

    public static Skill from(int id) {
        for (Skill skill : values()) {
            if (skill.id == id) {
                return skill;
            }
        }
        throw new IllegalArgumentException("Invalid skill id: " + id);
    }

    public String smallIconResource() {
        return "skill_icons_small/" + name + ".png";
    }
}

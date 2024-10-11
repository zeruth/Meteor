package net.runelite.api

enum class VolumeSetting(val value: Int, val volume: Float) {
    OFF(4, 0f),
    ONE(-1200, .25f),
    TWO(-800, .5f),
    THREE(-400, .75f),
    FOUR(0, 1f);

    companion object {
        fun of(int: Int): VolumeSetting {
            for (value in values()) {
                if (value.value == int)
                    return value
            }
            throw RuntimeException("Invalid Volume Setting")
        }
    }

}
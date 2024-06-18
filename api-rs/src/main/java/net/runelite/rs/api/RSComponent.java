package net.runelite.rs.api;

import net.runelite.api.Component;
import net.runelite.api.Loc;
import net.runelite.mapping.Import;

public interface RSComponent extends Component {
    @Import("id")
    int getID();

    @Import("hide")
    boolean getHidden();

    @Import("x")
    int getX();

    @Import("y")
    int getY();

    @Import("width")
    int getWidth();

    @Import("height")
    int getHeight();
}

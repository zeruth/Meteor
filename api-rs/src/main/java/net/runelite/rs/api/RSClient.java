package net.runelite.rs.api;

import net.runelite.api.Client;
import net.runelite.mapping.Import;

public interface RSClient extends Client, RSGameShell {
    @Import("init")
    void init$api();
}

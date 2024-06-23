package mixin;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSLoc;
import net.runelite.rs.api.RSLocEntity;

import java.awt.*;

@SuppressWarnings("ALL")
@Mixin(RSLoc.class)
abstract class Loc implements RSLoc {
    @Shadow("client")
    public static RSClient client;

    @Inject
    @Override
    public int getID() {
        return getBitset() >> 14 & 0x7FFF;
    }

    @Inject
    public int getSize() {
        return 1;
    }

    @Inject
    @Override
    public Point[] getLocalTilePoints() {
        int x = getX();
        int z = getZ();
        int y = client.getCurrentLevel();
        int height = client.getHeightmapY$api(y, x, z);
        int x0, y0;
        int x1, y1;
        int x2, y2;
        int x3, y3;

        int halfUnit = 64 * getSize();
        client.project$api(x - halfUnit, height, z - halfUnit);
        x0 = client.getProjectX();
        y0 = client.getProjectY();
        client.project$api(x + halfUnit, height, z - halfUnit);
        x1 = client.getProjectX();
        y1 = client.getProjectY();
        client.project$api(x - halfUnit, height, z + halfUnit);
        x2 = client.getProjectX();
        y2 = client.getProjectY();
        client.project$api(x + halfUnit, height, z + halfUnit);
        x3 = client.getProjectX();
        y3 = client.getProjectY();

        // one of our points failed to project
        if ((x0 == -1) || (x1 == -1) || (x2 == -1) || (x3 == -1)) {
            return null;
        }

        return new Point[] {new Point(x0, y0), new Point(x1, y1), new Point(x2, y2), new Point(x3, y3)};
    }
}

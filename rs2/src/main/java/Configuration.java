/**
 * set up the f2p/p2p server connection details
 * this connects to USA 2004scape servers by default
 * <a href="https://2004scape.org/api/v1/worldlist">2004Scape World List</a>
 */
public class Configuration {
    public static boolean localhost = false;
    public static final String F2P_CODEBASE_USA = "https://w1.225.2004scape.org";
    public static final String P2P_CODEBASE_USA = "https://w2.225.2004scape.org";
    public static String URL = F2P_CODEBASE_USA;

    public static final int F2P_OFFSET = 0;
    public static final int P2P_OFFSET = 3;
    public static int PORT_OFFSET = F2P_OFFSET;
    public static final int PORT = 43594;

    static void updateServerConnection() {
        if (Client.members) {
            URL = P2P_CODEBASE_USA;
            PORT_OFFSET = P2P_OFFSET;
        }
        else {
            URL = F2P_CODEBASE_USA;
            PORT_OFFSET = F2P_OFFSET;
        }
    }
}

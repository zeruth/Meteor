package meteor

import java.io.File

object Configuration {
    val dataDir = File(System.getProperty("user.home"), ".meteor-225/")

    init {
        if (!dataDir.exists()) {
            dataDir.mkdirs()
        }
    }
}
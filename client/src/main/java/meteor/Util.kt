package meteor

import com.google.gson.GsonBuilder

object Util {

    val gson = GsonBuilder().setPrettyPrinting().create()
}
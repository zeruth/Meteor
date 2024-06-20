package ext.java

object ClassLoaderExt {
    inline fun <reified T : Any> ClassLoader.createInstance(): T {
        return loadClass(T::class.simpleName).getDeclaredConstructor().newInstance() as T
    }
}
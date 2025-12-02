package main.util

import java.net.URL

class FileLoader {

    fun loadFile(path: String): URL? {
        val resource = this::class.java.classLoader.getResource(path)
        return resource;
    }
    fun getStringContent(path: String): String? {
        return loadFile(path)!!.readText()
    }
}
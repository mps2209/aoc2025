package main

import main.util.FileLoader

interface Day {
    val path: String
    val name: String
    fun p1()
    fun p2()

    var fileLoader: FileLoader
    fun loadFile(): String {
        val resource = fileLoader.loadFile(path)
        return resource!!.readText()
    }


}
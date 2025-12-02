package main.day2

import main.util.FileLoader
import java.net.URL

class Day2(val path: String) {
    val idRangeChecker = IdRangeChecker()
    val fileLoader = FileLoader()
    var resource: URL? = null
    var stringContent = ""
    var result = longArrayOf()
    fun run() {
        loadFile();
        stringContent.split(',').forEach {
            if (it.isNotEmpty()) {
                val sequence = it.split('-')

                val start = sequence[0].trim().toLong()
                val end = sequence[1].trim().toLong()
                result = longArrayOf(*result, *idRangeChecker.checkRange(start, end))
            }
        }
        println(result.sum())

    }

    fun loadFile() {
        this.resource = fileLoader.loadFile(path);
        this.stringContent = resource!!.readText();
    }
}
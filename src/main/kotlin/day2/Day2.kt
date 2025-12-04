package main.day2

import main.Day
import main.util.FileLoader
import java.net.URL

class Day2(override val path: String, override val name: String) : Day {
    val idRangeChecker = IdRangeChecker()
    override var fileLoader = FileLoader()
    var resource: URL? = null
    var stringContent = ""
    var result = longArrayOf()

    override fun p1() {
        stringContent=loadFile()
        stringContent.split(',').forEach {
            if (it.isNotEmpty()) {
                val sequence = it.split('-')

                val start = sequence[0].trim().toLong()
                val end = sequence[1].trim().toLong()
                result = longArrayOf(*result, *idRangeChecker.checkRange(start, end, false))
            }
        }
        println(result.sum())
    }

    override fun p2() {
        stringContent=loadFile()
        stringContent.split(',').forEach {
            if (it.isNotEmpty()) {
                val sequence = it.split('-')

                val start = sequence[0].trim().toLong()
                val end = sequence[1].trim().toLong()
                result = longArrayOf(*result, *idRangeChecker.checkRange(start, end, true))
            }
        }
        println(result.sum())
    }


}
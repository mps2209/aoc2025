package main.day1

import main.Day
import main.util.FileLoader
import java.net.URL

class Day1 (override val path:String, override val name:String
): Day {
    val part2=Day1P2()
    override var fileLoader = FileLoader()

    override fun p1() {
        val resource = loadFile(path)
        val content = resource!!.readText() // Kotlin stdlib extension
        println(solve(content))
    }

    override fun p2() {
        val resource = loadFile(path)
        val content = resource!!.readText() // Kotlin stdlib extension
        println(part2.solve(content))
    }

    fun loadFile(path: String): URL? {
        val resource = this::class.java.classLoader.getResource(path)
        return resource
    }

    fun solve(input: String): Int {
        var combination = 0
        var position = 50
        input.split("\n").forEach {
            if (it.isNotEmpty()) {
                if (it[0] == 'L') {
                    position = (position - getNumber(it)) % 100
                } else {
                    position = (position + getNumber(it)) % 100
                }
                if (position == 0) {
                    combination++
                }
            }
        }
        return combination
    }

    fun getNumber(input: String): Int {
        val trimmed = input.trim()
        return trimmed.substring(1, trimmed.length).toInt()
    }

}
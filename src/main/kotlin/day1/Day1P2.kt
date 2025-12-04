package main.day1

import java.net.URL

class Day1P2() {


    fun loadFile(path: String): URL? {
        val resource = this::class.java.classLoader.getResource(path)
        return resource
    }

    fun solve(input: String): Int {
        val safe = Safe()
        input.split("\n").forEach {
            if (it.isNotEmpty()) {
                val rotation = getNumber(it)
                safe.rotate(it[0], rotation)
            }
        }
        return safe.combination
    }
    fun getNumber(input: String): Int {
        val trimmed = input.trim()
        return trimmed.substring(1, trimmed.length).toInt()
    }
}

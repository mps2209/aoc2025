package main.day1

import java.net.URL

class Day1 {

    fun day1() {
        val resource = loadFile("day1.txt")
        val content = resource!!.readText() // Kotlin stdlib extension
        println(solve(content))
    }

    fun loadFile(path: String): URL? {
        val resource = this::class.java.classLoader.getResource(path)
        return resource;
    }

    fun solve(input: String): Int {
        var combination = 0;
        var position = 50;
        input.split("\n").forEach {
            if (it.isNotEmpty()) {
                if (it[0] == 'L') {
                    position = (position - getNumber(it)) % 100
                } else {
                    position = (position + getNumber(it)) % 100
                }
                if (position == 0) {
                    combination++;
                }
            }
        }
        return combination
    }

    fun getNumber(input: String): Int {
        val trimmed = input.trim();
        return trimmed.substring(1, trimmed.length).toInt()
    }
}
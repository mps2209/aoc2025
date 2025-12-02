package main

import main.day1.Day1
import main.day2.Day2
import kotlin.time.measureTime

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val timeTaken = measureTime {
        allDays()
    }
    println("all days took " + timeTaken)
}

fun allDays() {

    val days = arrayOf(Day1("day1.txt","day1"), Day2("day2.txt", "day2"))

    for (day in days) {
        var timeTaken = measureTime {
            day.p1()
        }
        println(day.name + " part 1 took " + timeTaken)
        timeTaken = measureTime {
            day.p2()
        }
        println(day.name + " part 2 took " + timeTaken)
    }
}
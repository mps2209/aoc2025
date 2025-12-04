package main.day3

import main.Day
import main.util.FileLoader

class Day3(
    override val path: String, override val name: String
) : Day {
    override var fileLoader = FileLoader()
    var content: String = ""
    var batteryChecker=BatteryChecker()
    var sum:Long=0
    override fun p1(){
        this.content = loadFile()
        sum=0
        this.content.split("\n").forEach {
            val cleaned=it.trim()
            if (cleaned.isNotEmpty()){
                sum+=batteryChecker.getMaxBankPower(cleaned)
            }
        }
        println(sum)
    }

    override fun p2() {
        this.content = loadFile()
        sum=0
        this.content.split("\n").forEach {
            val cleaned=it.trim()
            if (cleaned.isNotEmpty()){
                sum+=batteryChecker.getLargeMaxBankPower(cleaned)
            }
        }
        println(sum)
    }


}
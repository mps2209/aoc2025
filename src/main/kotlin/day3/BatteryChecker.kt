package main.day3

class BatteryChecker {

    fun getMaxBankPower(input: String): Long {
        var leftMax = 0
        var rightMax = 0
        for (i in 0..<input.length) {
            val batteryCharge = input[i].toString().toInt()
            if (leftMax < batteryCharge && i < input.length - 1) {
                leftMax = batteryCharge
                rightMax = input[i + 1].toString().toInt()
            } else if (rightMax < batteryCharge) {
                rightMax = batteryCharge
            }
        }
        val leftToRightMax = leftMax * 10 + rightMax
        return leftToRightMax.toLong()
    }


    fun getLargeMaxBankPower(input: String): Long {
        var result = ""
        var lastMaxChargePosition = 0
        for (i in input.length - 12..input.length - 1) {
            var maxCharge = input[i].toString().toInt()
            var newMaxChargePosition = i
            for (j in i downTo lastMaxChargePosition) {
                val currentCharge = input[j].toString().toInt()
                if (j <= lastMaxChargePosition) {
                    if (maxCharge <= currentCharge) {
                        maxCharge = currentCharge
                        newMaxChargePosition = j
                    }
                    lastMaxChargePosition = newMaxChargePosition + 1
                    result += maxCharge
                    break
                }
                if (maxCharge <= currentCharge) {
                    maxCharge = currentCharge
                    newMaxChargePosition = j
                }
            }

        }
        return result.toLong()
    }
}

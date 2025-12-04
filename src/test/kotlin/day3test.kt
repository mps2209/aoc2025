import main.day3.BatteryChecker
import main.day3.Day3
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class Day3Test {
    @Test
    fun day3test(){
        val day3= Day3("day3test.txt", "day2test")
        day3.p1()
        assertTrue(day3.content != "", "Content not found!")
        assertEquals(357, day3.sum)
    }
    @Test
    fun batteryBankCheckerTest(){
        val batteryChecker= BatteryChecker()
        assertEquals(98,batteryChecker.getMaxBankPower("987654321111111"))
        assertEquals(89,batteryChecker.getMaxBankPower("811111111111119"))
        assertEquals(78,batteryChecker.getMaxBankPower("234234234234278"))
        assertEquals(92,batteryChecker.getMaxBankPower("818181911112111"))

    }
    @Test
    fun batterBankCheckerLargeTest(){
        val batteryChecker= BatteryChecker()
        assertEquals(987654321111,batteryChecker.getLargeMaxBankPower("987654321111111"))
        assertEquals(888911112111,batteryChecker.getLargeMaxBankPower("818181911112111"))
        assertEquals(811111111119,batteryChecker.getLargeMaxBankPower("811111111111119"))
        assertEquals(434234234278,batteryChecker.getLargeMaxBankPower("234234234234278"))
    }

}
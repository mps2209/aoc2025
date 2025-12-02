import main.day2.Day2
import main.day2.IdRangeChecker
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Day2Test {
    @Test
    fun day2test(){
        val day2= Day2("day2test.txt")
        day2.loadFile();
        // Use the classloader to get the resource as a URL
        // Optional: check if the resource exists
        assertTrue(day2.resource != null, "Resource not found!")
        assertTrue(day2.stringContent != "", "Content not found!")
        day2.run();
        assertTrue(longArrayOf(11,22,99,1010,1188511885,222222,446446,38593859) contentEquals  day2.result)
        assertEquals(1227775554,day2.result.sum())
    }


    @Test
    fun advancedNumberCheckerTest(){
        val rangeChecker = IdRangeChecker();
        assertFalse(rangeChecker.checkAdvancedNumber(123123125))
        assertTrue(rangeChecker.checkAdvancedNumber(12341234))
        assertFalse(rangeChecker.checkAdvancedNumber(1))
        assertTrue(rangeChecker.checkAdvancedNumber(123123123))


    }
    @Test
    fun numberCheckerTest(){
        val rangeChecker = IdRangeChecker();
        assertTrue(rangeChecker.checkNumber(11))
        assertTrue(rangeChecker.checkNumber(22))
        assertFalse(rangeChecker.checkNumber(12))

    }

    @Test
    fun rangeCheckerTest(){
        val rangeChecker= IdRangeChecker()
        assertTrue(longArrayOf(11,22) contentEquals  rangeChecker.checkRange(11,22))
        assertTrue(longArrayOf(99) contentEquals rangeChecker.checkRange(95,115))
        assertTrue(longArrayOf(1010) contentEquals rangeChecker.checkRange(998,1012))
        assertTrue(longArrayOf(1188511885) contentEquals rangeChecker.checkRange(1188511880,1188511890))
        assertTrue(longArrayOf(222222) contentEquals rangeChecker.checkRange(222220,222224))
        assertTrue(longArrayOf() contentEquals rangeChecker.checkRange(1698522,1698528))
        assertTrue(longArrayOf(446446) contentEquals rangeChecker.checkRange(446443,446449))
        assertTrue(longArrayOf(38593859) contentEquals rangeChecker.checkRange(38593856,38593862))
        assertTrue(longArrayOf() contentEquals rangeChecker.checkRange(565653,565659))
        assertTrue(longArrayOf() contentEquals rangeChecker.checkRange(824824821,824824827))
        assertTrue(longArrayOf() contentEquals rangeChecker.checkRange(2121212118,2121212124))
    }
}
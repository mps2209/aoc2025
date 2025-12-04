import main.day1.Day1
import main.day1.Day1P2
import main.day1.Safe
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class MainTest {
    @Test
    fun day1p2test(){
        val day1 = Day1P2()
        // Use the classloader to get the resource as a URL
        val resource = day1.loadFile("day1test.txt")
        // Optional: check if the resource exists
        assertTrue(resource != null, "Resource not found!")

        // Read the content as string
        val content = resource.readText() // Kotlin stdlib extension
        assertEquals(6, day1.solve(content))
    }

    @Test
    fun safePositionTest(){
        val safe= Safe()
        safe.rotate('L',68)
        assertEquals(82,safe.position)
        safe.rotate('L',30)
        assertEquals(52,safe.position)
        safe.rotate('R',48)
        assertEquals(0,safe.position)
        safe.rotate('L',5)
        assertEquals(95,safe.position)
        safe.rotate('R',60)
        assertEquals(55,safe.position)
        safe.rotate('L',55)
        assertEquals(0,safe.position)
        safe.rotate('L',1)
        assertEquals(99,safe.position)
        safe.rotate('L',99)
        assertEquals(0,safe.position)
        safe.rotate('R',14)
        assertEquals(14,safe.position)
        safe.rotate('L',82)
        assertEquals(32,safe.position)

    }
    @Test
    fun safeCombinationTest(){
        val safe= Safe()
        safe.rotate('L',68)
        assertEquals(82,safe.position)
        assertEquals(1,safe.combination)
        safe.rotate('L',30)
        assertEquals(52,safe.position)
        assertEquals(1,safe.combination)
        safe.rotate('R',48)
        assertEquals(0,safe.position)
        assertEquals(2,safe.combination)
        safe.rotate('L',5)
        assertEquals(95,safe.position)
        assertEquals(2,safe.combination)
        safe.rotate('R',60)
        assertEquals(55,safe.position)
        assertEquals(3,safe.combination)
        safe.rotate('L',55)
        assertEquals(0,safe.position)
        assertEquals(4,safe.combination)
        safe.rotate('L',1)
        assertEquals(99,safe.position)
        assertEquals(4,safe.combination)
        safe.rotate('L',99)
        assertEquals(0,safe.position)
        assertEquals(5,safe.combination)
        safe.rotate('R',14)
        assertEquals(14,safe.position)
        assertEquals(5,safe.combination)
        safe.rotate('L',82)
        assertEquals(32,safe.position)
        assertEquals(6,safe.combination)
    }
    @Test
    fun day1test() {
        val day1 = Day1("day1test.txt","day1test")
        // Use the classloader to get the resource as a URL
        val resource = day1.loadFile("day1test.txt")
        // Optional: check if the resource exists
        assertTrue(resource != null, "Resource not found!")

        // Read the content as string
        val content = resource.readText() // Kotlin stdlib extension
        assertEquals(3, day1.solve(content))
    }
    @Test
    fun getNumberWorks(){
        val day1 = Day1("day1test.txt","day1test.txt")
        val resource = this::class.java.classLoader.getResource("day1test.txt")
        // Optional: check if the resource exists
        assertTrue(resource != null, "Resource not found!")
        val content = resource.readText() // Kotlin stdlib extension
        assertEquals(68, day1.getNumber(content.split("\n").first()))
        assertEquals(82, day1.getNumber(content.split("\n").last()))

    }
    @Test
    fun testModulo(){
        assertEquals(0, 0 % 100)
        assertEquals(99, 99 % 100)
        assertEquals(0, 100 % 100)
    }

}
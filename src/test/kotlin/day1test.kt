import main.Day1
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class MainTest {
    @Test
    fun day1test() {
        val day1 = Day1()
        // Use the classloader to get the resource as a URL
        val resource = day1.loadFile("day1test.txt")
        // Optional: check if the resource exists
        assertTrue(resource != null, "Resource not found!")

        // Read the content as string
        val content = resource!!.readText() // Kotlin stdlib extension
        assertEquals(3, day1.solve(content))
    }
    @Test
    fun getNumberWorks(){
        val day1 = Day1()
        val resource = this::class.java.classLoader.getResource("day1test.txt")
        // Optional: check if the resource exists
        assertTrue(resource != null, "Resource not found!")
        val content = resource!!.readText() // Kotlin stdlib extension
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
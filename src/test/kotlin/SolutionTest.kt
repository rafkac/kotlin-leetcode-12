import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class SolutionTest {
    private val solution = Solution()

    @Test
    fun `test basic roman numerals`() {
        assertEquals("III", solution.intToRoman(3))
        assertEquals("LVIII", solution.intToRoman(58))
        assertEquals("MCMXCIV", solution.intToRoman(1994))
    }

    @Test
    fun `test single digit numbers`() {
        assertEquals("I", solution.intToRoman(1))
        assertEquals("IV", solution.intToRoman(4))
        assertEquals("V", solution.intToRoman(5))
        assertEquals("IX", solution.intToRoman(9))
    }

    @Test
    fun `test larger numbers`() {
        assertEquals("MMMDCCXLIX", solution.intToRoman(3749))
        assertEquals("CDXLIV", solution.intToRoman(444))
    }

    @Test
    fun `test edge cases`() {
        assertEquals("", solution.intToRoman(0)) // Note: Roman numerals don't have 0
        assertEquals("MMMCMXCIX", solution.intToRoman(3999)) // Max reasonable value
    }
}
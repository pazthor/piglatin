import org.junit.Test
import kotlin.test.assertEquals

class RegexTest {
    @Test
    fun testRegexStartWithConsonantTransform(){
        val result = transformWithConsonant("pig")
        assertEquals("igpay", result )
    }

    @Test
    fun testStartWithConsonantAddVowels(){
        val result = startWithConsonant("ilpg")
        assertEquals(false, result )
    }

    @Test
    fun pigLatinWithTWOConsonant(){
        val result = pigLatin("string")
        assertEquals("string", result)
    }
}
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class RegexTest {
    @Test
    fun testRegexStartWithConsonantTransform(){
        val result = transformWithConsonant("pig")
        assertEquals("igpay", result )
    }

    @Test
    fun startWithConsonant(){
        val result = transformWithConsonant("zig")
        assertEquals("igzay", result )
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

    @Test
    fun startWithVowel(){
        val wordTransform = transformWithVowel("eat")
        assertEquals("eatay", wordTransform)
    }

    @Test
    fun validateStartWithVowel(){
        val isVowel = startWithVowel("eat")
        assertEquals(true, isVowel)
    }


    @Test
    fun pigLatinWithStartWithVowel(){
        val wordUpdate = pigLatin("eat")
        assertEquals("eatay", wordUpdate)
    }

    @Test
    fun matchStartWithTwoConsonants(){
        val wordUpdate = startWithTwoConsonants("tppolll")
        assertTrue(wordUpdate)
    }
}
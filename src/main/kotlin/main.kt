fun main(args: Array<String>) {

    val str = "bgpp"

    val result  =  pigLatin(str)
    println(result)
}


fun pigLatin(word: String): String{

   if( startWithConsonant(word) ) return transformWithConsonant(word)

    return word
}


fun startWithConsonant(word: String): Boolean{
      return STARTS_WITH_CONSONANT matches word
}

fun transformWithConsonant(word: String): String{
    val newWord = word.removeRange(0,1) + word[0] + "ay"
    return newWord
}

fun startWithConsonantCluster(): String{
    return "pig = igpay"
}


val STARTS_WITH_VOWEL = """/^[aeiou]/i""".toRegex()
val STARTS_WITH_CONSONANT = """^[b-df-hj-np-tv-z]""".toRegex()
val STARTS_WITH_TWO_CONSONANTS = """/^[b-df-hj-np-tv-z]{2}/i""".toRegex()
val ENDS_WITH_VOWEL = """/[aeiou]$/i""".toRegex()
val ENDS_WITH_CONSONANT = """/[b-df-hj-np-tv-z]$/i""".toRegex()
val ENDS_WITH_Y = """/y$/i""".toRegex()
val CAPTURE_LEADING_CONSONANTS = """/^([b-df-hj-np-tv-z]{1,})([a-zA-Z]*)/i""".toRegex()
val PHRASE = """/\w+/ig""".toRegex()


//when (x) {
//    0 -> println("zero")
//    in 1..9 -> println("single digit")
//    else -> println("multiple digits")
//}

//const wordTransform = (str) => {
//    if (regexes.startsWithVowel(str)) {
//        return conditionalCapitalize(str,transformVowelPrefixed(str));
//    } else if (regexes.startsWithTwoConsonants(str)) {
//        return conditionalCapitalize(str, transformMultiConsonantPrefixed(str));
//    } else {
//        return conditionalCapitalize(str, transformConsonantPrefixed(str));
//    }
//}
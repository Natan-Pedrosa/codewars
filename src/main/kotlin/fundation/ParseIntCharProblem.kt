package fundation
/*
You ask a small girl,"How old are you?" She always says, "x years old", where x is a random number between 0 and 9.

Write a program that returns the girl's age (0-9) as an integer.

Assume the test input string is always a valid string. For example, the test input may be "1 year old" or "5 years old". The first character in the string is always a number.
 */

fun main() {
    val yearsOld = readln()

    println("She has ${getAge(yearsOld)}")
}

/*
as a function just has one line, it could be coded an inline function. Ex:
 */
fun getAgeBest(yearsOld: String) = yearsOld[0].digitToInt()

fun getAge(yearsOld: String): Int {

    return yearsOld[0].toString().toInt()
    // yearsOld.take(1).toInt() -> good answer
    // yearsOld[0].digitToInt() -> good answer
}


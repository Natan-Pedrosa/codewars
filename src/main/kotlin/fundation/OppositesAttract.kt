/*
Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each. If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.

Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.
*/

fun main() {
    val flowerA = readln().toInt()
    val flowerB = readln().toInt()

    println(
        when(loveFun(flowerA, flowerB)){
            true -> "They love each other"
            else -> "They don't love each other"
        }
    )
}

fun loveFun(flowerA: Int, flowerB: Int): Boolean {
    return (flowerA % 2 == 0 && flowerB % 2 != 0) || (flowerA % 2 != 0 && flowerB % 2 == 0)
    //  (flowerA + flowerB) %2 == 1 -> best solution. A sum of two number odd and even will be always an odd number
}
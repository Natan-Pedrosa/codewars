package fundation
/*
Given an array of integers your solution should find the smallest integer.

For example:

Given [34, 15, 88, 2] your solution will return 2
Given [34, -345, -1, 100] your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty.
 */
fun main() {
    val numbers:List<Int> = readln().split(" ").map{it.toInt()}
    println(findSmallestIntTwo(numbers))
}

fun findSmallestInt(nums: List<Int>) = nums.min()
// my solution above doesn't pass but the code below worked
// nums.minOf { it }
fun findSmallestIntTwo(nums: List<Int>): Int {
    var min = Int.MAX_VALUE
    for (num in nums.listIterator()) {
        if (num < min)
            min = num
    }
    return min
}
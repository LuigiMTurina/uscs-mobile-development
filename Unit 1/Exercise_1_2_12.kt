/**
 * Exercise 1.2, number 12: Trying to do operations with te user input
 */

fun main() {
    var r = 0
    val a = readLine()?.toIntOrNull();
    val b = readLine()?.toIntOrNull();

    if(a != null && b != null && a < b) {
        for(i in a..b) {
            if(i % 2 == 0) {
                r += (i * 2 + a / (i + 1) + b / (i + 2))
            } else {
                r += (i + a % (i + 1) + b % (i + 2))
            }
        }
    }

    println("Answer: $r")
}
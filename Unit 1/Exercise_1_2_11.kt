/**
 * Exercise 1.2, number 11: Trying to catch user input
 */

fun main() {
    var r = 0
    val a = readLine()?.toIntOrNull();
    val b = readLine()?.toIntOrNull();

    if(a != null && b != null) {
        for(i in a..b) {
            r += (i + a%i + b%i)
        }
    }

    println("Answer: $r")
}
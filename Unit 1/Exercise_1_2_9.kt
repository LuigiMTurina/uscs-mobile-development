/**
 * Exercise 1.2, number 9: Using the "for" loop, passing the common parameters and a interval
 * of numbers as parameter
 */

fun main() {
    val lista = arrayOf(1, 2, 3, 4, 5)
    var r = 0

    for(n in lista) {
        if(n % 2 == 0) {
            r += n
        }
    }

    for(i in 1..5 step 2) {
        r *=  i
    }

    println("Answer: $r")
}
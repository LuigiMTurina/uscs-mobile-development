/**
 * Exercise 1.2, number 10: Switching the loop logic using "continue"
 */

fun main() {
    val lista = arrayOf(1, 2, 3, 4)
    var r = 1

    for(n in lista) {
        if(n % 2 != 0) {
            continue;
        }

        r += n
    }

    for(i in 1..r step 2) {
        if(i % 4 == 0) {
            continue
        }

        r += i
    }

    println("Answer: $r")
}
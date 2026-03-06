/**
 * Exercise 1.2, number 7: Still practicing the use of "when"
 */

fun main() {
    val list = arrayOf(1, 2, 3, 4, 5, 6, 7)
    var i = 0; var w = 0

    while(i < list.size) {
        if(i % 2 == 1)
            w = 1
        else
            w = 4

        i++
    }

    print("Answer: " + when( w ) {
        1 -> "um"
        2 -> "dois"
        3 -> "três"
        4 -> "quatro"
        else -> "outro"
    })
}
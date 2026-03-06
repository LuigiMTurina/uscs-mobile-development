/**
 * Exercise 1.2, number 6: Using "when" with intervals for each option
 */

fun gRespFour(w: Int): String {
    return when(w) {
        in 1..4 -> "W"
        in 0..8 -> "R"
        else    -> "U"
    }
}

fun main() {
    val list = arrayOf(1, 2, 3, 4, 5, 6, 7)
    var i = 0

    print("Answer: ")
    while(i < list.size) {
        if(i % 2 == 0) {
            val opt = list[i]
            print(gRespFour(opt) + " ")
        }
        i++
    }
}
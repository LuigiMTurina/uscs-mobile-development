/**
 * Exercise 1.2, number 5: Using "when" passing more than one option for a unique return
 */

fun gRespThree(w: Int): String {
    return when(w) {
        0, 1    -> "A"
        4, 5, 6 -> "B"
        else    -> "X"
    }
}

fun main() {
    val list = arrayOf(1, 2, 3, 4, 5, 6, 7)
    var i = 0

    print("Answer: ")
    while(i < list.size) {
        if(i % 2 == 0) {
            val opt = list[i]
            print(gRespThree(opt) + " ")
        }
        i++
    }
}
/**
 * Exercise 1.2, number 3: Here we start to know about the "when" syntax, a simple decision
 * structure that replaces the use of several "if/else"
 */

fun gResp(w: Int) : String {
    return when (w) {
        1 -> "A"
        2 -> "B"
        3 -> "K"
        else -> "Oi"
    }
}

fun main() {
    val list = arrayOf(1, 2, 3, 4)
    var i = 0;

    print("Answer: ")
    while (i < list.size) {
        val opt = list[i]
        print(gResp(opt) + ", ")
        i++
    }
}
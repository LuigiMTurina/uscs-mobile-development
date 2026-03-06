/**
 * Exercise 1.2, number 4: Practicing the use of "when" returning string output
 */


fun gRespTwo (w: Int) : Unit {
    return when(w) {
        1 -> print("SCS ")
        2 -> print("SBC ")
        3 -> print("SA ")
        else -> print("E ")
    }
}

fun main() {
    val list = arrayOf(1, 2, 3, 4)
    var i = 0

    print("Answer: ")
    while(i < list.size) {
        if(i % 2 == 0) {
            val opt = list[i]
            gRespTwo(opt)
        }
        i++
    }
}
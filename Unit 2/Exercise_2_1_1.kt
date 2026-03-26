fun calc(a: Int, b: Int , z: Boolean ): Int {
    val ds = if (z)
        a + b + 10
    else
        a - b + 5

    val x = 2 * ds
    return when (x){
        in 1..10 -> 1
        else     -> 2
    }
}
fun main() {

    val ps = listOf(1, 2, 3)
    var x = 0
    var y = 0
    for (m in ps) {
        y += calc(m, 2, false)
        x = x + y
    }
    print (x)
}
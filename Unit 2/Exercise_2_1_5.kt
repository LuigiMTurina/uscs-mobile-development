fun funct(n: Int): Int {
    return if (n == 0) 1 else n * funct(n - 1)
}

fun main() {
    val number = 5
    println(funct(3) + funct(4))
}
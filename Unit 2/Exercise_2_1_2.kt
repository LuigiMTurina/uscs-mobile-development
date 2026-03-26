fun aggregate(values: IntArray, op: String = "A"): Int {
    var result = if (op == "M") 1 else 0

    for (value in values) {
        when (op) {
            "A" -> result += value
            "S" -> result -= value
            "M" -> result *= value
        }
    }
    return result
}
fun main() {
    val numbers = intArrayOf(2, 3, 4)
    val a = aggregate(numbers, "M")
    val b = aggregate(numbers)
    println(a+b)
}
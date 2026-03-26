fun squareList(vararg numbers: Int): List<Int> {
    val result = mutableListOf<Int>();
    for (number in numbers)
        result.add(number * number);
    return result
}
fun main() {
    var squares = squareList(2, 3);
    println("Squares: $squares");
    squares = squareList(2, 3, 4, 5);
    println("Squares: $squares");
}
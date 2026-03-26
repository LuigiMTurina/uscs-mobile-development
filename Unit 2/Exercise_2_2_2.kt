/**
 * Exercise 2.2, number 2: Iterating in a List
 */

fun main() {

    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    println("List created!");

    val evens = mutableListOf<Int>();
    for(n in list) {
        if(n % 2 == 0) {
            evens.add(n);
        }
    }

    println("First number of the list: ${evens.first()}");
    println("Last number of the list: ${evens.last()}")
}
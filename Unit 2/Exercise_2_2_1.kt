/**
 * Exercise 2.2, number 1: Working with Lists and its methods
 */

fun main() {

    val fruits = mutableListOf("Apple", "Banana", "Orange");
    println("List created!");

    fruits.add("Grape");
    println("Fruit added!");

    fruits.removeAt(1);
    println("Fruit removed");

    val sortedFruits = fruits.sorted();
    println("Sorted list!");

    for(fruit in sortedFruits) {
        println(fruit);
    }
}
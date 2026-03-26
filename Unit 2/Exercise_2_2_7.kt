/**
 * Exercise 2.2, number 7: Converting an array to a set and seeing the values being removed
 */

fun main() {
    val duplicatedArray = arrayOf(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9);

    println("Array created!\n");

    print("Original array: [")
    for(n in duplicatedArray) {
        print("$n, ")
    }
    print("]\n")

    println("Array size: ${duplicatedArray.size}\n");

    val withoutDuplicates = duplicatedArray.toSet();

    println("Array converted to set!\n");
    println("Set size: ${withoutDuplicates.size}");
    println("Unique values in the set: $withoutDuplicates")
}
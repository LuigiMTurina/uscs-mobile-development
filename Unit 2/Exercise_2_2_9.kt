/**
 * Exercise 2.2, number 9: Trying to add duplicated values to a set and converting the set
 * to a list to use its methods
 */

fun main() {
    val decimals = mutableSetOf<Double>(1.0, 2.5, 3.75, 4.25, 5.25, 6.75, 7.75, 8.5, 9.9, 10.0);

    println("Decimals set created!\n");
    println("Original set: $decimals");

    decimals.add(5.25);
    decimals.add(4.25);
    decimals.add(3.25);
    decimals.add(2.25);
    decimals.add(1.25);
    println("\nNumbers added");

    println("New set: $decimals");

    val list = decimals.toMutableList();
    println("\nSet converted to List");

    list.sort();
    println("\nSorted list");
    for(n in list) {
        print("$n, ");
    }
}
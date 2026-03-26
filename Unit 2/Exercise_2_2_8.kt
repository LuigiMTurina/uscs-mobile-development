/**
 * Exercise 2.2, number 8: Verifying the existence of a value in a set
 */

fun main() {
    val cities = setOf("São Paulo", "São Caetano", "São Bernardo", "Diadema");

    println("Set of cities created!\n");

    if ("São Paulo" in cities) println("São Paulo is present in the set");
    if (!cities.contains("Sorocaba")) println ("Sorocaba is not in the set");
}
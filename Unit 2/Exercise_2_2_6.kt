/**
 * Exercise 2.2, number 6: Creating maps with Lists as a value
 */

fun main() {
    val map = mutableMapOf<String, MutableList<String>>();

    map["Fruits"] = mutableListOf("Banana", "Apple", "Pear", "Grape", "Strawberry");
    map["Drinks"] = mutableListOf("Coca Cola", "Fanta", "Grape juice", "Red Bull", "Monster");
    map["Sweets"] = mutableListOf("Dadinho", "Rice pudding", "Pudding", "Brigadeiro", "Moranguinho");

    println("Map created!");

    println("List of fruits: ${map["Fruits"]}");
    println("List of drinks: ${map["Drinks"]}");
    println("List of sweets: ${map["Sweets"]}");
}
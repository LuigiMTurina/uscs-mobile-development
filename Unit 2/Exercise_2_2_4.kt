/**
 * Exercise 2.2, number 4: Working with maps and accessing its values using its keys
 */

fun main() {
    val inventory = mutableMapOf<String, Double>();

    inventory["Notebook"] = 6000.00;
    inventory["Television"] = 8000.00;

    println("Inventory created!");
    println("Items in inventory: $inventory");

    inventory["Notebook"] = 5000.00;

    println("Notebook on sale for Black Friday!");
    println("Updated inventory: $inventory");

    inventory.remove("Television");

    println("Television out of stock!");
    println("Updated inventory: $inventory");
}
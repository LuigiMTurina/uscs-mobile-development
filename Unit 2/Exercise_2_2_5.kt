/**
 * Exercise 2.2, number 5: Using functions with maps as parameters
 */

fun main() {
    val students = mutableMapOf(
        "Henrique" to 8.5,
        "Yuri" to 9.5,
        "Erick" to 7.5,
        "Rhuan" to 5.5,
        "Gustavo" to 2.5,
        "Gabriel" to 10.0,
        "Rafael" to 9.5
    );

    println("Students map created!");

    println("\nThe class average is: ${studentAverage(students)}");

}

fun studentAverage(students : Map<String, Double>): Double {
    var average : Double = 0.0;

    for((key, value) in students) {
        if(!(key == null)) {
            average += value;
        } else {
            println("Key $key nonexistent!");
            println("Returning the average of the remaining students...");
            break;
        }
    }

    return average/students.size;
}
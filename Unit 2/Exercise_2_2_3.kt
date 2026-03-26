/**
 * Exercise 2.2, number 3: Extracting sublists and changing the value of them
 */

fun main() {

    val languages = mutableListOf("Kotlin", "Java", "JavaScript", "C++", "Python", "Assembly");
    println("List created!");

    println("Original list:")
    for(l in languages) {
        println(l)
    }

    val subLanguages = languages.subList(1, 4);

    subLanguages[2] = "C#"

    println("Changed list:")
    for(l in languages) {
        println(l)
    }

    println("Sublist:")

    for(l in subLanguages) {
        println(l)
    }
}
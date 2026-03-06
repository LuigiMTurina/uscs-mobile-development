/**
 * Exercise 1.2, number 1: Here we are practicing the basic syntax, facing a simple
 * introduction of Kotlin
 */

fun f1(p: Double, isMember: Boolean): Double {
    val d = if (isMember) {
        if (p > 100) {
            0.20
        } else {
            0.10
        }
    } else {
        if (p > 100) {
            0.05
        } else {
            0.0
        }
    }
    return p * (1 - d)
}

fun main() {
    val p = 150.0
    val isMember = false
    println("Answer: " + f1(p, isMember))
}

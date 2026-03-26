fun square(x: Int) = x * x;
fun isEven(x: Int) = if (x % 2 == 0) "a" else "b";
fun fibonacci(n: Int): Int = if (n <= 1) n else fibonacci(n - 1) + fibonacci(n - 2);
fun main() {
    val n = 8;
    println("${square(n)} ${isEven(n)} ${fibonacci(n)}");
}
fun calcDiscount(p: Double, d: Double = 10.0, isSpecial: Boolean = false): Double {
    val discount = if (isSpecial)
        d + 5.0
    else
        d
    val discountedPrice = p * (1 - discount / 100);
    return when {
        discountedPrice < 0 -> 0.0;
        else -> discountedPrice;
    }
}
fun main() {
    println (calcDiscount(isSpecial = true, p = 100.0, d = 15.0));
    println(calcDiscount(p = 100.0));

    val ps = listOf(100.0, 200.0, 300.0);
    for (lps in ps) {
        val d = calcDiscount(p = lps, isSpecial = false);
        println("$lps, $d");
    }
}

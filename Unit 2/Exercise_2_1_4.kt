fun func() :Int {
    val list = listOf(1,2,3)
    var x = 5;
    for (m in list)
        x +=m
    return x
}
fun func(a: Int) :Int{
    return (a + a%2 + a/3)
}
fun func(a: Int, b: Int) :Int {
    return when (a+b) {
        1 -> 2
        2 -> 3
        4 -> 5
        else -> 0
    }
}
fun main() {
    print(func() + func(1) + func(1,2))
}
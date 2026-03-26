fun printChar(c: Char, count: Int): Unit {
    var i = 1;
    while (i <= count) {
        print(c + " ");
        i++;
    }
}
fun main() {
    val list = charArrayOf('a', 'b', 'c')
    for (i in list.indices) {
        if (i % 2 == 0)
            printChar(list[i], i)
    }
}
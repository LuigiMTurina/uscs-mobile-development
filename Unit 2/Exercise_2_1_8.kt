fun printMessage(message: String, count: Int) : Unit {
    var i = 1;
    while( i <= count ) {
        print("$message$i ");
        i++;
    }
}
fun main() {
    var a = 5;
    printMessage(message = "CC", a)
}
fun main() {
    var result = decrease()
    println(result)
}

var byte: Byte = 1 // 1 byte
var short: Short = 1 // 2 bytes
var int: Int = 1 // 4 bytes
var long: Long = 1 // 8 bytes

var float: Float = 1.0f // 1 bytes - 6 digits
var double: Double = 1.0 // 2 bytes - 15 digits

var anyText: Any = "10"
var anyNumber: Any = 10

// without return, use type Unit
fun add(x: Int, y: Int): Unit {
    val total = x + y
    println(total)
}

//fun decrease(x: Int = 2, y: Int = 1): Int {
//    return x - y
//}

fun decrease(x: Int = 2, y: Int = 1): Int = x - y

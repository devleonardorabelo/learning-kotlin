fun main() {
    println("${pair.first},${pair.second}")
    println(pair)
    println("${triple.first},${triple.second},${triple.third}")
}

// var represents a mutable variable
var varHello = "Hello mutable"
// val represents a immutable variable
val valHello = "Hello immutable"
// Pair represents a pair of two values
val pair = Pair<Int, String>(1, "2")
// To access the values of a pair, there are two ways
// println("${pair.first},${pair.second}")
// val pair = 2 to 3

// Triple represents three values
val triple = Triple<Int, String, Double>(1, "2", 3.02)


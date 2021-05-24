fun main() {
    // var message = sayHello("Leonardo", "male")
    // println(message)
    // infiniteLoop()
    // loopWithBreak()
    // whileWithEnd()
    getResult(::multiply, 2,3)
}

var sayHello: (String, String) -> String = { name, gender ->
    "Hello, ${getRegards(gender)} $name"
}


//fun sayHello(name: String, gender: String): String {
//    return "Hello, ${getRegards(gender)} $name!"
//}

// fun sayHello(name: String, gender: String): String = "Hello, ${getRegards(gender)} $name!"

//fun getRegards(gender: String): String {
//    if (gender == "male") {
//        return "Mr."
//    } else {
//        return "Mrs"
//    }
//}

fun getRegards(gender: String): String = if (gender == "male") {
    "Mr."
} else {
    "Mrs"
}

fun infiniteLoop(): Nothing {
    while (true) {
        Thread.sleep(1000)
        println("Infinite Loops")
    }
}

fun doWithBreak() {
    var i: Int = 0
    do {
        println(i)
        i+=1
    } while (i !== 100)
}

fun whileWithEnd() {
    var i: Int = 0
    while (i < 100) {
        i+=1
        println(i)
        if (i == 50) break
    }
}

fun multiply(x: Int, y: Int) = x * y

fun getResult(multiply: (x: Int, y: Int) -> Int, x: Int, y: Int) {
    val result = multiply(x, y)
    println(result)
}


// Sobrecarga de métodos
fun getValue(arg1: String) = arg1
fun getValue(arg1: String, arg2: String) = Pair(arg1, arg2)
fun getValue(arg1: Int = 2) = arg1


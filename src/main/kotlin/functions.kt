fun main() {
    var message = sayHello("Leonardo", "male")
    println(message)
    infiniteLoop()
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
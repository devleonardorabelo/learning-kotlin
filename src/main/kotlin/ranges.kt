fun main() {
    // println(tryForeach()oreach(range))
    // println(tryForeach(rangeUntil))
    // tryRepeat(5)
    tryForBetweenAxes()
}

// 0,1,2,3,4,5
val range = 0..5
// 0,1,2,3,4
val rangeUntil = 0 until 5
// for each value
val rangeInverse =  0 downTo 5

fun tryFor(range: IntRange) {
    for (each in range) {
        println(each)
    }
}

fun tryForeach(range: IntRange) {
    range.forEach {each ->
        println(each)
    }
}

fun tryRepeat(times: Int) {
    var sum = 1
    var lastSum = 0
    repeat(times) {
        val temp = sum
        sum += lastSum
        lastSum = temp
        println("sum $sum last $lastSum")
    }
}

fun tryForBetweenAxes() {
    var sum = 1

//    for (y in 0 until 10) {
//        if (y % 2 != 0)
//            continue
//        for (x in 0 until 10) {
//            sum += x * y
//            println("x: $x, y: $y")
//        }
//    }
    col@ for (y in 0 until 10) {

        row@ for (x in 0 until 10) {
            if (x == y) continue@col
            sum += x * y
            println("x: $x, y: $y")
        }
    }
}
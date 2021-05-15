fun main() {
    val count: Int = 0;

    if (count > 1) println("Contador é igual a 1")
    else if (count == 2) println("Contador é igual a 2")
    else if (count < 3) println("Contador é menor que 3")
    else println("Contador é igual a $count")


    var countReturn = when {
        count > 1 -> "Contador é igual a 1"
        count == 2 -> "Contador é igual a 2"
        count < 3 -> "Contador é menor que 3"
        else -> "Contador é igual a $count"
    }

    println(countReturn)
}
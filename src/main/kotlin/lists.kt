fun main() {
    // Lista imutavel
    // val listOfCars = listOf("gol", "corsa", "uno")
    // println(listOfCars.first())

    // Lista mutavel
    // val listOfCars = mutableListOf<String>("gol", "corsa", "uno")
    // listOfCars.removeAt(1)
    // listOfCars.add("palio")
    // println(listOfCars)

    // Um array em kotlin tem tamanho fixo e imutavel
    // val listOfCars = arrayOf("gol", "corsa", "uno")
    // println(listOfCars.first())

    // Array tipado
    val count1 = intArrayOf(1,2,3)
    val count2 = intArrayOf(4,5,6)
    // Concatenando arrays em uma Lista
    val twoLists = listOf(count1, count2, "teste")
    val fullCount = count1 + count2
    // println(java.util.Arrays.toString(fullCount))
    // println(twoLists)
    // for (element in count1) print(element)
    // for (element in fullCount) print(element)
    // for ((index, element) in count1.withIndex()) {
    //  println("elemento numero $index, com valor de: $element")
    // }

}


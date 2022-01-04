fun main(args: Array<String>) {
    exampleBinarySearch()
}

fun exampleBinarySearch() {
    val alg = BinarySearch()
    val myList: List<Int> = listOf(1, 3, 5, 7, 9)
    println(myList)
    val myListTwo: List<Int> = (0..50).toList()
    println(myListTwo)
    val myListThree: List<Int> = (0..100 step 3).toList()
    println(myListThree)
    println("List 1 => " + alg.binarySearch(myList, 1)) // 0
    println("List 2 => " + alg.binarySearch(myListTwo, 9)) // 9
    println("List 3 => " + alg.binarySearch(myListThree, 18)) // 6
}
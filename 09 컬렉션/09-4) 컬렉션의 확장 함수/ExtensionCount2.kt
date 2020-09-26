package chap09.section4

fun main(){
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    // onEach: 각 요소를 람다식으로 처리 후 컬렉션으로 반환
    val returnedList = list.onEach{ println(it)}
    println()
    val reutrnedMap = map.onEach { println("key: ${it.key}, value: ${it.value}") }
    println("returnedList = $returnedList")
    println("returnedMap = $reutrnedMap")

}
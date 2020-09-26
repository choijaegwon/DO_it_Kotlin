package chap09.section4

fun main(){
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    // forEach: 각 요소르 람다식으로 처리
    list.forEach{ println("$it")}
    println()
    list.forEachIndexed { index, value -> println("index[$index]: $value")} // 인덱스 포함
}
package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    // contains: 요소가 포함되어 있으면 true를 반환
    println("contains: " + list.contains(2))
    println(2 in list)
    println(map.contains(11))
    println(11 in map)

    // containsAll: 모든 요소가 포함되어 있으면 true를 반환
    println("containsAll: " + list.containsAll(listOf(1, 2, 3)))
}
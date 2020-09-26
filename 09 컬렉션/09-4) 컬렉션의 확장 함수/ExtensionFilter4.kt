package chap09.section4

fun main(){
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listMixed = listOf(1, "Hlloe", 3, "World", 5, 'A')
    val listWithNull = listOf(1, null, 3, null, 5, 6)
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    // filterIsInstance: 여러 자료형의 요소 중 원하는 자료형을 골라냄
    println("filterIsInstance:" + listMixed.filterIsInstance<String>())
}
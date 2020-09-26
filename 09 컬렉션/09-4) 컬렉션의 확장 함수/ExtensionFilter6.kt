package chap09.section4

fun main(){
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listMixed = listOf(1, "Hlloe", 3, "World", 5, 'A')
    val listWithNull = listOf(1, null, 3, null, 5, 6)
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    // take: n개의 요소를 반환
    println(list.take(2)) // 앞에 두 요소 반환
    println(list.takeLast((2))) // 뒤에 두 요소 반환
    println(list.takeWhile { it < 3 }) // 조건식에 따른 반환
}
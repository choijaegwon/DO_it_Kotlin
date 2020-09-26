package chap09.section4

fun main(){
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listMixed = listOf(1, "Hlloe", 3, "World", 5, 'A')
    val listWithNull = listOf(1, null, 3, null, 5, 6)
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    // drop: 처음부터 n개의 요소를 제외한 List 반환
    println(list.drop(3)) // 앞의 요소 3개 제외하고 반환
    println(list.dropWhile{it < 3}) // 3 미만을 제외하고 반환
    println(list.dropLastWhile { it > 3 }) // 3 초과를 제외하고 반환
}
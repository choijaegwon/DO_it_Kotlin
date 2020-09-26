package chap09.section4

fun main(){
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    // max/min: 최대값 요소와 최솟값 요소의 반환
    println(list.max()) // 6
    println(list.min()) //1

    // maxBy/minBy: 최댓값과 최솟값으로 나온 요소 it에 대한 식의 결과
    println("maxBy: " + map.maxBy { it.key }) // 키를 기준으로 최댓값
    println("minBy: " + map.minBy { it.key }) // 키를 기준으로 최솟값
}
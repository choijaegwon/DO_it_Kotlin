package chap09.section4

fun main(){
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)

    // single: 람다식에 일치하는 요소 하나 반환
    println("single: " + listPair.single {it.second == 100})
    println("singleOrNull: " + listPair.singleOrNull {it.second == 500})
}
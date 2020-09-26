package chap09.section4

fun main(){
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)

    // indexOf: 주어진 요소에 일치하는 첫 인덱스 반환
    println("indexOf: " + list.indexOf(4))

    // indexOfFirst: 람다식에 일치하는 첫 요소의 인덱스 반환, 없으면 -1
    println("indexOfFirst:" + list.indexOfFirst {  it % 2 == 0 })

    // lastIndexOf: 주어진 요소에 일치하는 가장 마지막 인덱스 반환
    println("lastIndexOf:" + listRepeated.lastIndexOf(5))

    // indexOfLst: 람다식에 일치하는 마지막 요소의 인덱스 반환, 없으면 -1
    println("indexOfLast:" + list.indexOfLast { it % 2 == 0})
}
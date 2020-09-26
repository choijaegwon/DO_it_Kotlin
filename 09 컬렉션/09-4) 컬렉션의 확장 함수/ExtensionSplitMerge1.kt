package chap09.section4

fun main(){
    val list1 = listOf(1, 2, 3, 4, 5, 6)
    val list2 = listOf(2, 2, 3, 4, 5, 5, 6, 7)

    // partition: 주어진 식에 따라 2개의 컬렉션으로 분리해 Pair 로 반환
    val part = list1.partition{it % 2 == 0}
    println(part)
}
package chap09.section4

fun main(){
    val list1 = listOf(1, 2, 3, 4, 5, 6)
    val list2 = listOf(2, 2, 3, 4, 5, 5, 6, 7)

    // zio: 동일 인덱스 끼리 Pair를 만들어 반환
    val zip = list1.zip(listOf(7, 8))
    println(zip)
}
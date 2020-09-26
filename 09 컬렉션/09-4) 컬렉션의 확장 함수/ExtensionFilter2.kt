package chap09.section4

fun main(){
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listMixed = listOf(1, "Hlloe", 3, "World", 5, 'A')
    val listWithNull = listOf(1, null, 3, null, 5, 6)
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    // filterIndexed: 인덱스와 함께 추출
    println("filterIndexed: " + list.filterIndexed({idx, value -> idx != 1 && value % 2 == 0}))

    // filterIndexedTo: 추출 후 가변형 컬렉션으로 변환
    val mutList=
            list.filterIndexedTo(mutableListOf()) { idx, value -> idx != 1 && value % 2 == 0}
    println("filterIndexedTo: $mutList")
}
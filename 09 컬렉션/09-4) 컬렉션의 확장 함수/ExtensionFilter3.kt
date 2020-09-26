package chap09.section4

fun main(){
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listMixed = listOf(1, "Hlloe", 3, "World", 5, 'A')
    val listWithNull = listOf(1, null, 3, null, 5, 6)
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    // filterKeys/filterValues: Map의 키, 값에 따라 추출
    println("filterKeys:" + map.filterKeys { it != 11}) // 키 11을 제외한 요소
    println("filterValues: " + map.filterValues { it == "Java" }) // 값이 "Java"인 요소
}
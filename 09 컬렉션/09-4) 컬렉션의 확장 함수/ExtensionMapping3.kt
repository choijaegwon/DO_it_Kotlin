package chap09.section4

fun main(){
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listWithNull = listOf(1, null, 3, null, 5, 6)

    // groupBy: 주어진 함수의 결과에 따라 그룹화하여 map으로 반환
    val grpMap = list.groupBy { if (it % 2 == 0 ) "even" else "odd" }
    println(grpMap)
}
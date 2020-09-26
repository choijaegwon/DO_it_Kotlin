package chap09.section4

fun main(){
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listWithNull = listOf(1, null, 3, null, 5, 6)

    // flatMap: 각 요소에 식을 적용한 후 다시 합쳐 새로운 컬렉션을 반환
    println(list.flatMap{listOf(it,'A')})
    val result = listOf("abc", "12").flatMap{it.toList()}
    println(result)
}
package chap09.section4

fun main(){
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    // fold: 최깃값과 정해진 식에 따라 처음 요소부터 끝 요소에 적용하며 값을 생성
    println(list.fold(4) { total, next -> total + next }) // 4 + 1 + ... + 6 = 25
    println(list.fold(1) { total, next -> total * next }) // 1 * 1 * 2 * ...* 6 = 720

    // foldRigh: fold와 같고 마지막 요소에서 처음요소로 반대로 적용
    println(list.foldRight(4) { total, next -> total + next })
    println(list.foldRight(1) { total, next -> total * next })

    // reduce: fold와 동일하지만 초깃값을 사용하지 않음
    println(list.reduce { total, next -> total + next })
    println(list.reduceRight { total, next -> total + next })
}
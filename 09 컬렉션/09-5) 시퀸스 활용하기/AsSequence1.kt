package chap09.section5

fun main(){
    val list1 = listOf(1, 2, 3, 4, 5)
    val listSeq = list1.asSequence()
            .map { println("map($it)"); it * it} // 1번
            .filter { println("filter($it) "); it % 2 == 0 } // 2번
            .toList() // 3번
    println(listSeq)
}
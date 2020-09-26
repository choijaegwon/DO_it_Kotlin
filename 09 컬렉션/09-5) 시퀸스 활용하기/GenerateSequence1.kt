package chap09.section5

fun main(){
    // 시드 값 1을 시작으로 1씩 증가하는 스퀸스 정의
    val nums: Sequence<Int> = generateSequence(1) { it +  1 }

    val squares = generateSequence(1) { it + 1  }.map {it *it}
    println(squares.take(10).toList())

    val oddSquares = squares.filter { it %2 != 0}
    println(oddSquares.take(5).toList())
}
package chap02.section3

fun main(){
    val num = 256

    if (num is Int) { //1번 num이 Int형일때
        print(num)
    } else if (num !is Int) { //2번 num이 Int형이 아닐때, !(num is Int)와 동일
        println("Not a Int")
    }
}
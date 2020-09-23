package chap06.section2

class Person {
    lateinit var name: String // 1번 지연 초기화를 위한 선언

    fun test(){
        if(!::name.isInitialized){ // 2번 프로퍼티의 초기화 여부 판단
            println("not initialized")
        } else {
            println("initialized")
        }
    }
}

fun main(){
    val kilong = Person()
    kilong.test()
    kilong.name = "Kimdong" // 3번 이 시점에서 초기화됨(지연 초기화)
    kilong.test()
    println("name = ${kilong.name}")
}
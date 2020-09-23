package chap06.section2

class LazyTest {
    init{
        println("init block") // 2번
    }

    val subject by lazy{
        println("lazy initialized") // 6번
        "Kotlin Programming" // 7번 lazy 반환값
    }
    fun flow(){
        println("not initialized") // 4번
        println("subject one: $subject") // 5번 최초 초기화 시점!
        println("subject two: $subject") // 8번 이미 초기화된 값 사용
    }
}

fun main(){
    val test = LazyTest() // 1번
    test.flow() // 3번
}
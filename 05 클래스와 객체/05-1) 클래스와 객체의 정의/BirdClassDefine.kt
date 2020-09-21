package chap05.section1.define

class Bird { // 1번 클래스의 정의
    // 2번 프로퍼티(속성),변수
    var name: String = "mybird"
    var wing: Int = 2
    var beak: String = "short"
    var color: String = "blue"

    // 3번 메서드(함수)
    fun fly( ) = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main( ){
    val coco = Bird( ) // 4번 클래스의 생성자를 통한 객체의 생성
    coco.color = "blue" // 5번 객체의 프로퍼티에 값 할당

    println("coco.color: ${coco.color}") // 6번 객체의 멤버 프로퍼티 읽기
    coco.fly() // 7번 객체의 멤버 메서드 사용
    coco.sing(3)
}
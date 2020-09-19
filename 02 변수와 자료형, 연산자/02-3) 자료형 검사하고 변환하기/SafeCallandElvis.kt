package chap02.section3

fun main() {
    var str1 : String? = "Hello Kotlin"
    str1 = null
    println("str1: $str1 lenght: ${str1?.length ?: -1}") //세이프 콜과 엘비스 연산자를 활용
}
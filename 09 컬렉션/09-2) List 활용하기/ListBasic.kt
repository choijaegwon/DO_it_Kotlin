package chap09.section2

fun main(){
    // 불변형 List의 사용
    var numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    var names: List<String> = listOf("one", "tow", "three")

    for (name in names){
        println(name)
    }
    for (num in numbers) print(num) // 한 줄에서 처리하기
    println() //내용이 없을 때는 한 줄 내리는 개행
}
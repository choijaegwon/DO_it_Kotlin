package chap08.section1

class Box<T>(t: T){ //형식 매개변수로 받은 지라를 name에 저장
    var name = t
}

fun main(){
    var box1: Box<Int> = Box<Int>(1)
    var box2: Box<String> = Box<String>("Hello")
    println(box1.name)
    println(box2.name)
}
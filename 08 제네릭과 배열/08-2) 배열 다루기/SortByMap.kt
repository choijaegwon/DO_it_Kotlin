package chap08.section2

fun main(){
    val fruits = arrayOf("banana", "avocade", "apple", "kiwi")
    fruits
            .filter { it.startsWith("a")}
            .sortedBy { it }
            .map{ it. toUpperCase()}
            .forEach{ println(it) }
}
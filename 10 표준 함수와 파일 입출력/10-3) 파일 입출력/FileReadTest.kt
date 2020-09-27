package chap10.section3

import java.io.*

fun main(){
    val path = "D:\\test\\Over the Rainbow.txt"

    try{
        val read = FileReader(path)
        println(read.readText())
    } catch(e: Exception){
        println(e.message)
    }
}
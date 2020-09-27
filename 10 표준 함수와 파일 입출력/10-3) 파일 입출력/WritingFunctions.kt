package chap10.section3

import java.io.File
import java.io.FileWriter
import java.io.PrintWriter

fun main(){
    val outString: String = "안녕하세요!\tHello\r\nWorld!." // 1번 문자열의 구성
    val path = "D:\\test\\testfile.txt"

    val file = File(path)
    val printWriter = PrintWriter(file)

    printWriter.println(outString) // 2번 파일에 출력
    printWriter.close()
}
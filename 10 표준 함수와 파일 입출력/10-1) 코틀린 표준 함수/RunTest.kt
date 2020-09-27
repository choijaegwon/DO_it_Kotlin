package chap10.section1

fun main(){
    data class Person(var name: String, var skills: String)
    var person = Person("kildong", "Kotlin")
    val retrunObj = person.apply{
        this.name ="Sean"
        this.skills ="Java"
        "success" // 사용되지 않음
    }
    println(person)
    println("retrunObj: $retrunObj")

    val returnObj2 = person.run{
        this.name = "Dooly"
        this.skills = "C#"
        "success"
    }
    println(person)
    println("retrunObj2: $returnObj2")
}
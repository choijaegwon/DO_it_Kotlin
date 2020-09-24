package chap07.section1

interface Bird{
    val wings: Int
    fun fly()
    fun jump(){
        println("bird jump!")
    }
}

interface Horse{
    val maxSpeed: Int
    fun run()
    fun jump(){
        println("jump!, max: speed: $maxSpeed")
    }
}

class Pegases : Bird, Horse{
    override val wing: Int = 2
    override val maxSpeed: Int = 100
    override fun fly(){
        println("Fly!")
    }
    override fun run(){
        println("Run!")
    }
}

fun main(){
    val peagsus = Pegases()
    peagsus.fly()
    peagsus.run()
    peagsus.jump()
}
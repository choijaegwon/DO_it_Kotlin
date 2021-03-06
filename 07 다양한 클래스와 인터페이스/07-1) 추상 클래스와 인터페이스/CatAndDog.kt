package chap07.section1

open class Animal(val name: String)

// 1번 feeding의 구현을 위해 인터페이스 Pet 지정
class Dog(name: String, override var category: String) : Animal(name), Pet{
    override var species: String = "dog"
    override fun feeding(){
        println("Feed the dog a bone")
    }
}

class Master{
    fun playWithPet(pet: Pet) { //  인터페이스를 개체로 매개변수를 지정
        println("Enjoy whis my ${pet.species}")
    }
}

fun main(){
    val master = Master()
    val dog = Dog("Toto", "Small")
    val cat = Cat("Coco", "BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat)
}
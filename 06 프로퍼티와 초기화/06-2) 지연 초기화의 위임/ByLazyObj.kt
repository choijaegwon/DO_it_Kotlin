package chap06.section2.bylazyobj

class Person(val name: String, val age: Int)

fun main(){
    var isPersonInstantiated: Boolean = false // 초기화 확인 용도

    val person : Person by lazy { // 1번 lazy를 사용한 person 객체의 지연 초기화
        isPersonInstantiated = true
        Person("Kim", 23) // 3번 이 부분이 Lazy 객체로 반환됨
    }
    val persionDelegate = lazy { Person("Hong", 40)} // 3번 위임 변수를 사용한 초기화

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${persionDelegate.isInitialized()}")

    println("person.name = ${person.name}") // 4번 이 시점에서 초기화
    println("personDelegate Intit: ${persionDelegate.value.name}") // 5번 이 시점에서 초기화

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${persionDelegate.isInitialized()}")
}


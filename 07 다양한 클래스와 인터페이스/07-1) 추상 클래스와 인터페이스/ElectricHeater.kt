package chap07.section1

class ElectricHeater (var heater: Boolean = false) : Heater {
    override fun on(){
        println("[ElectricHeater] heating...")
        heating = true
    }

    override fun off(){
        heating = false
    }

    override fun isHot() : Boolean = heating
}
// Polymorphism
open class Vehicle{
    open fun startEngine(){
        // Code to start Engine
    }
}

class BMWCar():Vehicle(){
    override fun startEngine(){
        println("BMWCar: starting the engine")
        super.startEngine()
    }
}

class AudiCar():Vehicle(){
    override fun startEngine(){
        println("Audi Car: starting the engine")
        super.startEngine()
    }
}

fun main(){
    // val bmwCar:BMWCar=BMWCar()
    val bmwCar:Vehicle=BMWCar()
    startCar(bmwCar )

    val audiCar:Vehicle=AudiCar()
    startCar(audiCar)

}

fun startCar(car:Vehicle){
    car.startEngine()
}

// fun startBmwCar(car:BMWCar){
//     car.startEngine()
// }

// fun startAudiCar(car:AudiCar){
//     car.startEngine()
// }
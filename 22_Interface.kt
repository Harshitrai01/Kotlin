// Student is inherited from person class. so student is a person,
// What if students wants to be a footballer, it can't because it's 
// already a person. In Kotlin we can inherit only one class.

// Multiple inheritance with help of interface
interface Footballer{
    val position: String
    fun dribble()
    fun kick(){
        println("Kick the football")
    }
}

open class Persons(val name:String)
// We are inheriting the interface Footballer also.

class Stud(name:String, override val position: String):Persons(name), Footballer{
    override fun dribble(){
        println("Dribble the ball")
    }
}

fun main(){
    val student = Stud("John", "Striker")
    playFootball(student)
    printNames(student)
}

fun playFootball(footballer:Footballer){
    footballer.dribble()
    footballer.kick()
}

fun printNames(person:Persons){
    println("Person's name is ${person.name}")
}
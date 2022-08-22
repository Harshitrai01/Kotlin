// open keyword - all classes are final by default,
// if we want to a class to be inherited, we need to declare it explicitly.
open class Person(val name: String) {
    init {
        println("This is a person")
    }
    open var age: Int = 19
    open fun doWork() {
        println("Person is doing work")
    }
}

class Students(name: String, val school: String, override var age: Int) : Person(name) {
    init {
        println("This is a student")
    }
    // We cant override until we put it open.
    override fun doWork() {
        println("Student is studying")
        // Acessing properities and function of parent class using super keyword.
        super.doWork()
    }
}

fun main() {
    val student = Students("John", "DP School", 10)
    student.doWork()
    // This is a person class and we are assigning student objec to it.
    // Student is parent here.
    //  val x:Person=Students("Mark","Doe")
    println("The age of student is ${student.age}")

    val x: Any = 4
    val y: Any = "Mark"
}

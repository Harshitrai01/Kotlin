// Constructors
// Two Types
// 1.Primary_Constructor  2.Secondary_Constructor

// Primary Constructor(Can have default values)
class student constructor(firstName:String="Mark"){
   // class student (val firstName:String="Mark")
   // We can have properties only inside the primary constructor.

   // We can get rid of this
    val firstName: String
    var lastName: String?=null

    init{
        println("init block called")
        // We can get rid of this
        this.firstName=firstName
    }

    // Secondary Constructor with two parameters
    constructor(firstName:String, lastName:String):this(firstName){
        println("secondary constructor is called")
        this.lastName=lastName
    }

}

fun main(){
//    val Student=student("John")
    val Student=student("John","Doe")
    println("Name of the student is: ${Student.firstName} ${Student.lastName}")

}
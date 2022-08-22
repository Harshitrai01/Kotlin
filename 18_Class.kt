class Student{
    val school:String="DP School"
    var age:Int=5

    // If age is greater than 12 return T or F
    // getter will be called and the expression will be returned
    val isTeenager:Boolean
        get()=age>12

    var name:String? = null
    get() = field?: "Unknown"
    set(value){
        if(value!=null)
            field=value
    }
}


fun main(){
    val student=Student()
    println("1. Student is a teenager: ${student.isTeenager}")
    student.age=14
    println("2. Student name is: ${student.isTeenager}")

    println("3. Student name is: ${student.name}")

    student.name="John"
    println("4. Student name is: ${student.name}")
}
/* Class need to store the data, from api or net, etc.
   Can have only properties inside the class
 */

 data class Learner(val name:String, var section: String){
    var age: Int =8
 }

 fun main(){
    val student = Learner("John", "A")
    student.age=10

    val student1 = Learner("John", "A")

    // equals
    println("Line1: equals() function: ${student1.equals(student)}")

    //toString
    println("Line2: toString() function: ${student1.toString()}")

    //copy
    val student2=student.copy(name="Mark")
    println("Line 3: copy() function: ${student2.toString()}")

    //destructing
    val(name,section)=student
    println("Line4: destructing: $name is in section $section")

 }
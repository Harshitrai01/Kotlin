/* Nested Inner class
   class inside the class 
   Nested class can't access the data members of outer class.
   In inner class we can access data members of the outer class.
*/

   class Studs(val name:String){
    inner class SchoolBag(){
        fun printBagOwner(){
            println("This school bag belongs to: $name")
        }
    }
   }

   fun main(){
    val student:Studs=Studs("Mark")
    student.SchoolBag().printBagOwner()

   }
abstract class person(val name:String){
    abstract fun doWork()
    fun doTalk(){
        // a function to talk
    }
}

class students(name:String, val school:String): person(name){
    override fun doWork(){
        println("Student is studying")
    }
}

fun main(){
    val Student=students("John","DP School")
    Student.doWork()
}
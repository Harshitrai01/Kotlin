/* Singelton are objects which have only one instances
   Thsese are used to hold the utility functions.
*/

object GameScore{
    var score:Int=0
        private set

    fun addScore(point:Int){
        if(point>0){
            this.score+=point
        }
    }
}

class studs(val name:String){
    // comapnion object
    companion object {
        const val schoolName="DP School"
    }
}

fun main(){
    // We can acess through the class name.
    GameScore.addScore(10)
    println("The Score is ${GameScore.score}")
    println("The school is ${studs.schoolName}")
}

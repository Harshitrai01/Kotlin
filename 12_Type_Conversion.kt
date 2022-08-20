// Type Conversion
fun main(){
    val a:Int=10
    val b:Long=a.toLong()
    println(b)

    // Type of name variable is Any
    // Checking type of operator
    val name:Any="Jhon"
    if(name is String){
        println(name.length)
    }

    // Type Casting
    var name1: String=name as String
    println(name1)

     val x:Int=7
    // val y: Long = x as Long //error

    //safe cast operator - If everything goes right then it will cast,
    //                      and if things goes wrong, it returns null.
    val z:Long?=x as? Long
    println(z)

}
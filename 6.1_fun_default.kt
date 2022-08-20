fun main(){
// Default arguments
    printUserName1("Jhon","Frost")
    printUserName1("Jhon")

// In named argument order is not necessary while passing.
println(volume("Record Box", 2, h=5, b=3))

}

fun printUserName1(firstName: String, lastName:String="Doe"){
    println("The name is : $firstName $lastName")
}

// Named Argument
fun volume(boxName:String, l:Int, b:Int, h:Int): Int{
    println(boxName)
    return l*b*h
}
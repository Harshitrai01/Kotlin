fun main(){
    // Null Saftey
    // This Null is only for compile time.
    var name: String? = null

    // safe call operator- If variable is null then it returns the null value
    println(name?.length)

    // Elvis operator ?: - Evaluates the operators on LHS, if null then print 0.
    // Ternary operator for null.
    println(name?.length ?: 0)

    printName("Jhon","Doe")

}

fun printName(firstName: String?, lastName:String?){
    if(firstName!=null){
        //Not null assertion operator !!.
        println("Name: ${firstName.length} ${lastName!!.length}")
    }
}

/* Two types
    1. Non Nullable - String
    2. Nullable - String? (We put ? to make null)

    If a variable is of null type then only two types of operators are allowed:-
    1. safe call operator ?.
    2. not mull assertion operator !!.
*/
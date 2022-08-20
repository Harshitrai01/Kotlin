fun main(){
    val a=5
    val b=6
    println("Sum of ${a} and ${b} is ${sum(a,b)}")
    println("Sum of ${a} and ${b} is ${sum1(a,b)}")
    printSum(6,5)
    printSum1(6,5)
}

// Return type of function is Int
fun sum(a:Int,b:Int): Int{
    return a+b
}

// A function body can be an expression. Its return type is inferred.
fun sum1(a:Int,b:Int) = a+b


// A function that returns no meaningful value.
// A functions which returns nothing, returns Unit.
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

// Unit Return Type can be ommited
fun printSum1(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

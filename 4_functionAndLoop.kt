

fun main(){
    printBorder()
    val name="Rohan"
    println(name)
    printBorders()
}

fun printBorder(){
    println("=================")
}

fun printBorders(){
    // Repeat the task 18 times.
    repeat(18){
        print("=")
        // print() is used because you do not jump to the new line.
    }
}
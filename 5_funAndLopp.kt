fun main() {
    val border = "`-._,-'"
    val times_to_repeat=4
    printBorder(border,times_to_repeat)
    println("Happy Birthday, Jhansi!")
    printBorder(border,times_to_repeat)
}

// Passing Argument to the functions.
fun printBorder(border:String,times_to_repeat:Int) {
    repeat(times_to_repeat) {
        print(border)
    }
    println()
}
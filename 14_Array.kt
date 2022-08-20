fun main(){
    // Array
    val numbers = arrayOf(1,2,3,4)

    println("The number at second position: ${numbers.get(1)}")
    println("The number at second position: ${numbers[2]}")
    numbers.set(3,5)
    numbers[1]=22
    println(numbers.joinToString(" "))

    // Another Way
    val numbersZero=Array(4){0}
    println(numbersZero.joinToString(","))

}
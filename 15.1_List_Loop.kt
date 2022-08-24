
fun main(){
    //While Loop

    val guestsPerFamily = listOf(2, 4, 1, 3)
    var totalGuests = 0
    var index = 0
    while (index < guestsPerFamily.size) {
        totalGuests += guestsPerFamily[index]
        index++
    }

    println("Total Guest Count: $totalGuests")
    println("---------------------------------")
    // For loop
    val names = listOf("Jessica", "Henry", "Alicia", "Jose")
    for(name in names)
        println(name)

    for (name in names) {
            println("$name - Number of characters: ${name.length}")
    }

    
}

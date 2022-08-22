enum class Metal(val symbol:String){
    // These are constants of enum class METAL, but metal cna't be intantiated
    IRON("Fe"), 
    GOLD("Au"),
    SILVER("Ag")
}

fun main(){
    // We can get all the constants of the enum using the values function.

    for(metal in Metal.values()){
        println("Symbol: ${metal.symbol}, Name: ${metal.name}, Ordinal: ${metal.ordinal}")
    }
    printMetal(Metal.IRON)
}

fun printMetal(metal:Metal){
    println(metal.name)
}
fun main(){

    // Mutable Set
    val names=setOf("John","Mark","Fin")
    println("Size of set is: ${names.size}")
    println("Set contains ${names.contains("Finn")}")

    // Mutable Set
    val name=mutableSetOf("John","Mark","Fin")
    name.add("Mark")
    println(names)
    name.remove("John")
    println(name)
    

}
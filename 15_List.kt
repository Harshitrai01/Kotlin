fun main(){
    // This is Immutable List
    val names=listOf("Jhon","Mark","Sarah","Finn")
    println("The size of the list is: ${names.size}")
    println("2nd item in list is: ${names.get(1)}")
    println("2nd item in list is ${names[1]}")
    println("Fin is at index ${names.indexOf("Finn")} in the lsit")

    // Mutable List
    val name=mutableListOf("Jhon","Mark","Sarah","Finn")
    name.add("Harshit")
    name.removeAt(0)
    name.remove("Mark")
    println(name)
    name.set(0,"Mike")
    name[1]="Michael"
    println(name)
    name.clear()
    println(name)
}
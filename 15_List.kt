fun main(){
    // This is Immutable List
    val names=listOf("Jhon","Mark","Sarah","Finn")
    println("List: $names")
    println("The size of the list is: ${names.size}")
    println("2nd item in list is: ${names.get(1)}")
    println("2nd item in list is ${names[1]}")
    println("Fin is at index ${names.indexOf("Finn")} in the lsit")

    println("First: ${names.first()}")
    println("Last: ${names.last()}")   
    
    // Use the contains() method
    println("Contains 4? ${names.contains("Sarah")}")
    println("Contains 7? ${names.contains("John")}")

    // Reversing List
    println("Reversed list: ${names.reversed()}")
    println("List: $names")

    // Using sorted()
    val oddNumbers = listOf(5, 3, 7, 1)
    println("List: $oddNumbers")
    println("Sorted list: ${oddNumbers.sorted()}")


    println("----------------------------------------")
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

    println("----------------------------------------")

    val entrees = mutableListOf<String>()
    // val entrees: MutableList<String> = mutableListOf()

    // Instead of adding elements one by one using add(), 
    // you can add multiple elements at a time using addAll() and pass in a list.


    val moreItems = listOf("ravioli", "lasagna", "fettuccine")
    println("Add list: ${entrees.addAll(moreItems)}")
    println("Entrees: $entrees")

    println("Empty? ${entrees.isEmpty()}")


}
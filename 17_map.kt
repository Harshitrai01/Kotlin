fun main(){
    //  Map:
    val classRanks=mapOf(1 to "Sarah", 2 to "Mark", 3 to "Finn", 4 to "John")
    println("Students: ${classRanks.values}")
    println("Ranks: ${classRanks.keys}")
    println("Finn has got a rank ${classRanks.containsValue("Finn")}")
    println("This is 4th rank ${classRanks.containsKey(4)}")
    println("student at first rank is: ${classRanks.get(1)}")

    // Mutable_Map:
    val classRank=mutableMapOf(1 to "Sarah", 2 to "Mark", 3 to "Finn", 4 to "John")
    classRank.put(4,"Jim")
    classRank.remove(2)
    println(classRank)

}
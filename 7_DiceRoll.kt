fun main(){
    // val diceRange=1..6
    // val randomNumber=diceRange.random()
    // println(randomNumber)

    val myFirstDice=Dice(6)
    
    
    // println(myFirstDice.sides)
    // println(myFirstDice.roll())

    val diceRoll=myFirstDice.roll()
    // println("Your ${myFirstDice.sides} sided dice rolled ${diceRoll}!")

    // myFirstDice.sides = 20
    println("Your ${myFirstDice.numSide} sided dice rolled ${diceRoll}!")
    val mySecondDice = Dice(20)
    println("Your ${mySecondDice.numSide} sided dice rolled ${diceRoll}!")

}

class Dice(val numSide:Int){
    // var sides=6

    fun roll():Int {
        return ((1..numSide).random())
    }
}
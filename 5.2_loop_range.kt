fun main(){
    // Use of Range
    println("Line 1")
    for(i in 1..5){
        println(i)
    }

    println("Line 2")

    if(4 !in 5..10){
        println("Not There")    
    }

    println("Line 3")

    for(i in 1 until 5){
        println(i)
    }

    println("Line 3")

    for(i in 1..5 step 2){
        println(i)
    }

    println("Line 4")
    for(i in 5 downTo 1){
        println(i)
    }
}
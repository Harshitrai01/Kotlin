open class persons{

    fun walk(){
        println("Person is walking")
    }

    fun sleep(){
        println("Person is sleeping")
    }

    open fun talk(){
        println("Person is talking")
    }
}

fun main(){
    // Anonymus classses to just modify few things in function
    startTalking(object: persons(){
        override fun talk(){
            println("I am Talking")
        }
    })
}

fun startTalking(person:persons){
    person.talk()
}


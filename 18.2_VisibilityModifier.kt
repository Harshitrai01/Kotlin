class Child private  constructor(val name: String="Mark"){
    constructor(firstName: String, lastName:String):this("$firstName $lastName")
}

fun main(){
    // val student = Child("John")
    val student1= Child("John","Doe")
}

/* Visibility Modifier :-

    1. public
    2. internal
    3. protected
    4. private
    
 */
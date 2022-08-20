fun main(){
    // String Concatenation
        val name: String="Jhon"+" Doe"
        println(name)

        val address: String="House no."+ 23
        println(address)

        // Error
        // val address1: String=23 + ", Block C"
        // println(address1)

        // String Template
        val flatNumber:Int=25
        val address1: String="Tower 2, Flat No. $flatNumber"
        println(address1)
        
        // If you print expressions you have to assign in curly{} braces.
        println("Hello ${3+1}")
}
// Sealed Class-Restricted class hirarchy.
// we know how many subclass can exist.

sealed class NetworkState{
    data class Error(val errorText:String): NetworkState()
    object Loading: NetworkState()
    data class Loaded(val content:String):NetworkState()
}

fun main(){
    val data: NetworkState=NetworkState.Loaded("Data Load")
    processState(data)
}

fun processState(state:NetworkState){
    when(state){
        is NetworkState.Error->{println("Error occured: ${state.errorText}")}
        is NetworkState.Loading->{/* show progress bar */}
        is NetworkState.Loaded->{println("Content: ${state.content}")}
        // No need for else all classes are covered.
    }
}
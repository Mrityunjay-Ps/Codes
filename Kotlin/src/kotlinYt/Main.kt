package kotlinYt

fun main(){
    val trickFun = trick
    trick()
    trickFun()
}

val trick = {
    println("No treats!")
}
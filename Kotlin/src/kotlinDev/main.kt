package kotlinDev

fun main() {

//    //storing a function in a variable
//    val greet = hello
//    treat()

    val treatFunction = trickOrTreat(false) { "$it quarters" }
    val trickFunction = trickOrTreat(true, null)
    treatFunction()
    trickFunction()

}

//more efficient way to store function in the variable - use of lambda expression
//val hello = {
//    println("Hello Jay!!")
//}
fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat
    }
}

val treat: ()-> Unit = {
    println("Have a treat!")
}

val trick = {
    println("No treats!")
}
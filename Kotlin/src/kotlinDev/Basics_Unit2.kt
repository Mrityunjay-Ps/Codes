
fun traffic() {
    val trafficLight = "Amber"

    /*
    val message = if(trafficLight=="Red") "Stop"
    else if(trafficLight=="Yellow") "Slow"
    else if(trafficLight=="Green") "Go"
    else "invalid color"

    println(message)
    */

    val message = when (trafficLight) {
        "Red" -> "Stop"
        "Yellow", "Amber" -> "Slow"
        "Green" -> "Go"
        else -> "invalid color"
    }
    println(message)
}

fun findX() {
    val x: Any = 13
    when(x){
           /*
         2 -> println("x is a prime number between 1 and 10.")
         3 -> println("x is a prime number between 1 and 10.")
         5 -> println("x is a prime number between 1 and 10.")
         7 -> println("x is a prime number between 1 and 10.")
    	*/
           2,3,5,7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        is Int -> println("x is an integer number, but not between 1 and 10.")
        else -> println("x isn't a prime number between 1 to 10.")
    }
}

fun nulllables(){
    /*
    This is how we can assign null to a not null variable
    var num: Int? = 1
    println(num)
    num = null
    println(num)
    */
    
    var favoriteActor: String = "Sandra Oh"
    println(favoriteActor.length)
    
    //notnull variable
    var favoriteActors: String = "Sandra Oh"
    println(favoriteActor.length)

    /*
    This is how we can access the methods of nullable properties
    */
    
    //nullable variable
    var favoriteActorr: String? = "Sandra Oh"
    println(favoriteActorr?.length)
}

fun main(){
    traffic()
}
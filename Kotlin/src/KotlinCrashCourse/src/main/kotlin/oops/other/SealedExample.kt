package oops.other


sealed class Ball {
    
}

class Football(val color: String = "Blue") : Ball() {

}

class BasketBall() : Ball() {

}

class Teniss(val color: String = "Yellow") : Ball() {
    
}

fun main() {

    val b1: Ball = Teniss()
    val b2: Ball = BasketBall()
    val b3: Ball = Football()

    println(b1)

}


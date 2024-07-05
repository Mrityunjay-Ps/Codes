package Learn.`Kotlin-Yt-main`

//normal function
fun add(n1:Int, n2:Int) {
    println("Add 2 numbers: ${n1+n2}")
}

//lamda functions

//val cube = {n : Int -> n * n * n}

val add = {num1:Int, num2:Int -> num1+num2}

fun call():String {
    multiply(4,6)
    println(multiply)
    return "Hello"
}

val multiply = { n:Int, n1:Int -> n*n1 }


fun main() {
    multiply(2,4)
    call()
}


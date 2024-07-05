package Learn.`Kotlin-Yt-main`

import javax.security.auth.callback.Callback

//fun multiplyTwoNumbers(num1:Int,num2:Int,callback: () -> Unit) {
//    println("Multiplication of two numbers is: ${num1*num2}")
//    callback()
//}

fun cube(num1:Int, callback: (message:String) -> Unit){
    println("Cube of $num1 is ${num1*num1*num1}.")
    callback("cube calculated")
}



fun main() {
//    multiplyTwoNumbers(2,3) {
//        println("Hellooooo")
//    }


    val store=cube(3) {
        println("yayy")
    }

}
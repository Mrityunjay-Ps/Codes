package kotlinYt

fun main(){
    val ob = Calculator()
    println(ob.add(3,7))

}


//Made one class
class Calculator{

    //Made a class property
    //also added a late-init means no need to initialize the property now
    lateinit var name: String

    //Made a nullable property
    var operator: Char? = null


    //Made 2 functions
    fun add(num1: Int, num2:Int): Int {
        return num1+num2
    }
    
    fun multiply(num1:Int, num2:Int): Int {
        return num1*num2
    }
}
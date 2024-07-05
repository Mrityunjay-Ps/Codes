package kotlinYt

/*
* Variables, these are nothing but containers to save our data/values in a program
* also these variables data/values can be changed and updated in the program
* It secures some memory location in the program for storing the data...
* */

/*
* In Java :
*   int a = 10;
* It stores an integer value in variable which is named as 'a'.
*
* But in kotlin it is different:
*   We can initialize(make a variable) in two ways val and var.
* If we use val keyword then we can't update the value once initialized/ Constant variable is created and
* If we use var keyword then we can update the stored value anytime
* */
fun main() {
    variables()
}
fun variables () {

    var name = "Jay"
    val userId = 32123
    var lastName = "Singh"
    println("Name is $name")
    println(userId)
    println(lastName)
    println("---------------------------")

    //This is string interpolation
    println("Name is $name")

    var a = 59
    var b = 23
    println("Sum of $a and $b is equal to ${a+b}")


}
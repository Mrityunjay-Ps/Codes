package Learn.oops


//concrete class
abstract class Animal {

    abstract val breed : String
    fun walk(){
        println("I am walking")
    }

    abstract fun speak()
//    now we can one incomplete class there is no body the function,
//    so now we will make it abstract,
//    so now when we have an abstract function in a class we need to the class also abstract

}

class Cat: Animal() {
    override val breed: String
        get() = "sdadadcz"

    //    here we have completed the function which was incomplete,
//    but we have completed the function in a child class.
    override fun speak() {
        println("Hello")
    }

}




fun main() {
//    WE can make the object of a concrete class
//    if the class is abstract then we cannot make the object of that class until,
//    the incomplete function is completed

//    so now we will make the object of cat, and now we can call both speak and walk function.

    val animal = Cat()
    animal.walk()
    animal.speak()
    animal.breed
}
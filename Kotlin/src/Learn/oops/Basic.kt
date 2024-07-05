package Learn.oops

class Car(name:String = "adsa", seats:Int = 3) {

    init {

        println("only 1 time ")
    }

    constructor(name:String) : this() {

    }

//    data-members

    //class - prop
    var name:String = name
    val seats = seats
    val color = "white"


    //class - methods/functions
    fun changeGear(){
        println("Change gear")

    }
}

fun main() {

//    Car car = new Car();

    val car = Car("sada",4)
    println(car.seats)



}
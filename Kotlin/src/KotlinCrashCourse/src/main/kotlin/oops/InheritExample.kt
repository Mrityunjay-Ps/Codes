package oops

open class Vechicle() {
    var x = 40
    fun displayX() {
        println("X=$x")
    }
}

open class Bike : Vechicle(){
    var y = 50
    fun displayY() {
        println("Y = $y")
    }
}
//
//
class BMW : Bike() {
    var bekarProp = "main to child hoon meethasamosa ka"

}


fun main() {

    val ob:Vechicle = BMW()




//    val meethaSamosa = MeethaSamosa()


//    val bekarSamosa = BekarSamosa()
//    println(bekarSamosa.bekarProp)
//    bekarSamosa.displayX()
//    bekarSamosa.displayY()

}

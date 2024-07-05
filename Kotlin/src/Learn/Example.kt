package Learn

data class Students(val name : String, val rollno : Byte);

fun main() {

//    val nums = arrayOf("asad", 3, 5.324242432, 6.4F, Students("raj", 2), Students("Ajay", 4))
//    println(nums[0])

//    val car =  listOf("bmw","honda","bmw","toyota")

    val anyType = mutableListOf("bmw", 234, 3.242F, false)

    val a = setOf("bmw","honda","bmw","toyota")
//    println(a.size)

    val b = mutableSetOf("bmw","honda","bmw","toyota")

    val m = mapOf(1 to "Monday", 2 to "Tuesday")
//    println(m[1])

    for (key in m.keys){
        println(m[key])
    }



}
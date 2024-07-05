package Learn

//Functions



fun students(
    name:String = "name",
    age:Int = 0,
    address:String = "address",
    id:Int = 0
){
    println(name)
    println(age)
    println(address)
    println(id)
}


fun add(num1:Int,num2:Int) : Int {
    return num1 + num2
}

fun add(num1: Int, num2: Int, num3:Int):Int{
    return num1+num2+num3
}


fun main() {
//    students()
//    println("--------------")
//    students("jay",19,"das",4)

//    val result = add(3,4)
//    println(result)
//    add()

    val number : Any = "10"
    val numsString = number as Int;
    println(numsString)


}
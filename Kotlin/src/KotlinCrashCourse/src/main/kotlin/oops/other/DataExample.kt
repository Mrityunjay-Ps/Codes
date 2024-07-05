package oops

import Learn.oops.Animals

sealed class Test
{
    override fun toString(): String {
        return "this is tostring test"
    }

}

data class Person(var name: String, var age:Int) : Animals {
    override val color: String
        get() = TODO("Not yet implemented")

    override fun speak() {
        TODO("Not yet implemented")
    }
}

fun main() {

//    val test = Test()
//    println(test.hashCode())
//
//
//    val person1=Person("jay",26)
//    println(person1.age)
//    println(person1.name)
////    val person1Copy = person1.copy()
//    val person1Copy = person1.copy()
//
//    println(person1Copy.age)
//    println(person1Copy.name)
//    person1Copy.name="akash"
//    println(person1.name)
//    println(person1Copy.name)
//    println("----------------")
//    println(person1)
//    println(person1Copy)
//
//    println(Test())

}
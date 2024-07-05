package Learn.oops

interface MyInter{

    val name:String
    fun m1()

}

interface Animals{
    val color:String
    fun speak()
}

class Dogs : Animals {
    override val color: String
        get() = "black"

    override fun speak() {
        println("bark")
    }

}


interface Cloneable{
    fun clone()
}

class MyInterImpl : MyInter, Cloneable {
    override val name: String
        get() = "Jay"

    override fun m1() {
        println("m1 function")
    }

    override fun clone() {
        println("clone method")
    }
}
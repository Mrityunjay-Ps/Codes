package oops

class User {
    var userId: String = "defaultid"
        get() {
            println("getting values")
            return field
        }
//        set(value) {
//            println("setting value $value")
//            if (value.isEmpty()) {
//                println("Invalid Value for userid !!")
//            }
//            field = value
//        }

    var userName: String = "sda"
        set(value) {
            field = value
        }
        get() {
            return userName
        }
}


fun main() {

    val user1 = User()


    user1.userId = "asca"
    user1.userName=""
    println(user1.userId)


}
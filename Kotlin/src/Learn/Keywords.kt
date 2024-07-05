package Learn

import java.util.Set as jay

typealias DkSet = Set<String>

typealias InSet = Set<Int>

fun main() {


    add(10,20,29,328,43,324,425,234,675,31,75)



}

fun add(vararg rollNums:Int){
    for (i in rollNums) {
        println(i)
    }
    println("---------------------")
    println(rollNums[2])
}
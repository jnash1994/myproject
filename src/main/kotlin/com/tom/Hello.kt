package com.tom

fun main(args: Array<String>) {
    //println("Hello Kotlin")
    //Human().hello()   不用new就能產生物件
    val h = Human()
    h.hello()
}


class Human {

    fun hello(){

        println("Hello kotlin")

    }



}

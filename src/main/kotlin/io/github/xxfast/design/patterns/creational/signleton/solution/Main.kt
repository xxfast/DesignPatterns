package codes.isuru.kotlin.creational.signleton.solution

import codes.isuru.java.creational.singleton.Batman

val theBatman = Batman()

object BatMobile {
    private val driver: Batman = theBatman
}

fun main() {
    val theBatMobile = BatMobile
    val anotherBatMobile = BatMobile
    assert(theBatMobile === anotherBatMobile)
}
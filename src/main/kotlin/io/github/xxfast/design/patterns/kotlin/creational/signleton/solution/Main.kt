package io.github.xxfast.design.patterns.kotlin.creational.signleton.solution

import io.github.xxfast.design.java.creational.singleton.Batman

val theBatman = Batman()

object BatMobile {
    private val driver: Batman = theBatman
}

fun main() {
    val theBatMobile = BatMobile
    val anotherBatMobile = BatMobile
    assert(theBatMobile === anotherBatMobile)
}
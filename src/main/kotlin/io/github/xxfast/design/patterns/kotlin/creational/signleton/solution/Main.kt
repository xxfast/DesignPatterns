package io.github.xxfast.design.patterns.kotlin.creational.signleton.solution

interface Chef {
  val name: String
  val experience: Int
}

object MasterChef: Chef {
  override val name: String = "The One Who Remains"
  override val experience: Int = Int.MAX_VALUE
}

fun main() {
  val chef = MasterChef
  val anotherChef = MasterChef
  assert(chef === anotherChef)
}
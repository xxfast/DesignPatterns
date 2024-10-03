package io.github.xxfast.design.patterns.behavioural.state.solution

sealed interface Matter {
  fun heatUp(): Matter
  fun coolDown(): Matter
}

interface Solid: Matter {
  fun melt(): Liquid
  fun sublime(): Gas
}

interface Liquid : Matter {
  fun evaporate(): Gas
  fun freeze(): Solid
}

interface Gas : Matter {
  fun depose(): Solid
  fun condense(): Liquid
}

class Ice : Solid {
  override fun melt() = Water()
  override fun sublime() = Vapour()
  override fun heatUp() = melt()
  override fun coolDown() = this
}

class Water : Liquid {
  override fun evaporate() = Vapour()
  override fun freeze() = Ice()
  override fun heatUp() = evaporate()
  override fun coolDown() = freeze()
}

class Vapour : Gas {
  override fun condense() = Water()
  override fun depose() = Ice()
  override fun heatUp() = this
  override fun coolDown() = condense()
}

val water = Water() // Liquid

fun main(){
  water.coolDown() // Solid
    .melt() // Liquid
    .heatUp() // Gas
//    .evaporate()
}

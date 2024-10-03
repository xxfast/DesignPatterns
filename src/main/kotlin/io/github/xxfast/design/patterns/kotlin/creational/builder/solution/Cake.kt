package io.github.xxfast.design.patterns.kotlin.creational.builder.solution

import io.github.xxfast.design.java.creational.builders.shared.Layers
import io.github.xxfast.design.java.creational.builders.shared.Sponge
import io.github.xxfast.design.java.creational.builders.shared.Candle
import io.github.xxfast.design.java.creational.builders.shared.Topper

sealed interface CakeRecipe
data class VanillaCakeRecipe(val containsEggs: Boolean) :
  io.github.xxfast.design.patterns.kotlin.creational.builder.solution.CakeRecipe

fun Cake(recipe: io.github.xxfast.design.patterns.kotlin.creational.builder.solution.CakeRecipe) =
  _root_ide_package_.io.github.xxfast.design.patterns.kotlin.creational.builder.solution.Cake(
    isDairyFree = recipe is io.github.xxfast.design.patterns.kotlin.creational.builder.solution.VanillaCakeRecipe && recipe.containsEggs,
  )

class Cake(
  val layers: List<Layers> = List(4) { Layers() },
  val toppings: List<Candle> = List(3) { Candle() },
  val isGluttonFree: Boolean = true,
  val isDairyFree: Boolean = false,
  val topper: Topper? = null,
  val sponge: Sponge = Sponge()
)

val car =
  _root_ide_package_.io.github.xxfast.design.patterns.kotlin.creational.builder.solution.Cake(isDairyFree = true)
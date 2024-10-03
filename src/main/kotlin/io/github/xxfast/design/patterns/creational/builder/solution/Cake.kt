package io.github.xxfast.design.patterns.creational.builder.solution

import io.github.xxfast.design.patterns.creational.builders.shared.Layers
import io.github.xxfast.design.patterns.creational.builders.shared.Sponge
import io.github.xxfast.design.patterns.creational.builders.shared.Candle
import io.github.xxfast.design.patterns.creational.builders.shared.Topper

sealed interface CakeRecipe
data class VanillaCakeRecipe(val containsEggs: Boolean) : CakeRecipe

fun Cake(recipe: CakeRecipe) = Cake(
  isDairyFree = recipe is VanillaCakeRecipe && recipe.containsEggs,
)

class Cake(
  val layers: List<Layers> = List(4) { Layers() },
  val toppings: List<Candle> = List(3) { Candle() },
  val isGluttonFree: Boolean = true,
  val isDairyFree: Boolean = false,
  val topper: Topper? = null,
  val sponge: Sponge = Sponge()
)

val car = Cake(isDairyFree = true)
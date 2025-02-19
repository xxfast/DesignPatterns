package io.github.xxfast.design.patterns.kotlin.creational.builder.solution

import io.github.xxfast.design.java.creational.builders.shared.Layers
import io.github.xxfast.design.java.creational.builders.shared.Sponge
import io.github.xxfast.design.java.creational.builders.shared.Candle
import io.github.xxfast.design.java.creational.builders.shared.Topper

sealed interface CakeRecipe

class Fillings
data class VanillaCakeRecipe(val containsEggs: Boolean) : CakeRecipe

fun Cake(recipe: CakeRecipe) = Cake(
  isDairyFree =
    recipe is VanillaCakeRecipe && recipe.containsEggs,
)

class Cake(
  val layers: List<Layers> = List(4) { Layers() },
  val toppings: List<Candle> = List(3) { Candle() },
  val fillings: List<Fillings> = List(3) { Fillings() },
  val isGluttonFree: Boolean = true,
  val isDairyFree: Boolean = false,
  val topper: Topper? = null,
  val sponge: Sponge = Sponge()
)

val lie = Cake(
  layers = List(4) { Layers() },
  toppings = List(3) { Candle() },
  isGluttonFree = true,
  isDairyFree = false,
  topper  = null,
  sponge = Sponge()
)
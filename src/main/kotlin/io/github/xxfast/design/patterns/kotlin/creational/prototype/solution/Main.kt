package io.github.xxfast.design.patterns.kotlin.creational.prototype.solution

import io.github.xxfast.design.java.creational.prototype.Ingredient
import io.github.xxfast.design.java.creational.prototype.Ingredient.*

data class Dish(
  val name: String,
  private val ingredients: List<Ingredient>,
  private val calories: Int,
)

val theOriginal = Dish(
  "Ratatouille",
  listOf(Eggplant, Zucchini, Tomatoes, Carrot, Garlic, Onion, Herbs, OliveOil),
  140
)

val theCopy = theOriginal.copy(name = "Diet ${theOriginal.name}", calories = 120)
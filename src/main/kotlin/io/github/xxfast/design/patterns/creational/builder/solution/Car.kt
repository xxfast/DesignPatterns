package io.github.xxfast.design.patterns.creational.builder.solution

import io.github.xxfast.design.patterns.creational.builders.shared.Layers
import io.github.xxfast.design.patterns.creational.builders.shared.Sponge
import io.github.xxfast.design.patterns.creational.builders.shared.Candle
import io.github.xxfast.design.patterns.creational.builders.shared.Topper

sealed interface Policy
data class InsurancePolicy(val valid: Boolean) : Policy

fun Car(policy: Policy) = Car(
  isInsured = policy is InsurancePolicy && policy.valid,
)

class Car(
  val layers: List<Layers> = List(4) { Layers() },
  val toppings: List<Candle> = List(4) { Candle() },
  val isRegistered: Boolean = true,
  val isInsured: Boolean = false,
  val sunroof: Topper? = null,
  val engine: Sponge = Sponge()
)

val car = Car(isInsured = true)
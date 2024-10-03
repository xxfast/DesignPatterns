package io.github.xxfast.design.patterns.creational.builder.solution

import io.github.xxfast.design.patterns.creational.builders.shared.Door
import io.github.xxfast.design.patterns.creational.builders.shared.Engine
import io.github.xxfast.design.patterns.creational.builders.shared.Seat
import io.github.xxfast.design.patterns.creational.builders.shared.Sunroof

sealed interface Policy
data class InsurancePolicy(val valid: Boolean) : Policy

fun Car(policy: Policy) = Car(
  isInsured = policy is InsurancePolicy && policy.valid,
)

class Car(
  val doors: List<Door> = List(4) { Door() },
  val seats: List<Seat> = List(4) { Seat() },
  val isRegistered: Boolean = true,
  val isInsured: Boolean = false,
  val sunroof: Sunroof? = null,
  val engine: Engine = Engine()
)

val car = Car(isInsured = true)
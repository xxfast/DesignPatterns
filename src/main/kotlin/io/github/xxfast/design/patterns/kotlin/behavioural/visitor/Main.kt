package io.github.xxfast.design.patterns.kotlin.behavioural.visitor

import io.github.xxfast.design.patterns.kotlin.behavioural.visitor.Compartment.Boiler
import io.github.xxfast.design.patterns.kotlin.behavioural.visitor.Compartment.Bulkhead
import io.github.xxfast.design.patterns.kotlin.behavioural.visitor.Compartment.Kitchen
import io.github.xxfast.design.patterns.kotlin.behavioural.visitor.Compartment.Room
import io.github.xxfast.design.patterns.kotlin.behavioural.visitor.Compartment.Stairs

sealed class Compartment {
  object Kitchen : Compartment()
  object Stairs : Compartment()
  object Boiler : Compartment()
  object Bulkhead : Compartment()
  class Room(val name: String, val compartments: List<Compartment>) : Compartment()
}

class Ghost {
  fun haunt(compartment: Compartment): String = buildString {
    when (compartment) {
      is Kitchen -> append("🍽️ The dishes are rattling")
      is Stairs -> append("🪜 the stairs are creaking")
      is Boiler -> append("🫥 the boiler is clinking")
      is Bulkhead -> append("🚪 the bulkhead doors are rattling")

      is Room -> {
        append("👻 Noises coming from the ${compartment.name} \n")
        compartment.compartments
          .joinToString("\n") { haunt(it) }
          .let { append(it) }
      }
    }
  }
}

fun main() {
  val ghost = Ghost()
  val basement = Room(
    name = "Basement",
    compartments = listOf(Stairs, Boiler, Bulkhead)
  )

  val room = Room(
    name = "House",
    compartments = listOf(Kitchen, basement)
  )

  println(ghost.haunt(room))
}


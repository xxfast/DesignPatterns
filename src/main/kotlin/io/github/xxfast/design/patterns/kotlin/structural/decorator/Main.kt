package io.github.xxfast.design.patterns.kotlin.structural.decorator

import io.github.xxfast.design.patterns.kotlin.structural.decorator.Bed.King
import io.github.xxfast.design.patterns.kotlin.structural.decorator.Pool.PlungePool
import io.github.xxfast.design.patterns.kotlin.structural.decorator.Tub.Jacuzzi

enum class Bed { Twin, Double, Queen, King }
enum class Tub { BathTub, Jacuzzi }
enum class Pool { PlungePool, SwimmingPool }

fun interface RoomDecorator {
  fun decorate(): String
}

fun Room(number: Int) = RoomDecorator { "Room #$number\n" }
fun RoomDecorator.bed(bed: Bed): RoomDecorator = RoomDecorator { decorate() + "Bed = $bed\n" }
fun RoomDecorator.tub(tub: Tub): RoomDecorator = RoomDecorator { decorate() + "Tub = $tub\n" }
fun RoomDecorator.pool(pool: Pool): RoomDecorator = RoomDecorator { decorate() + "Pool = $pool\n" }

fun main() {
  val decoration = Room(42)
    .bed(King)
    .tub(Jacuzzi)
    .pool(PlungePool)
    .decorate()

  println(decoration)
}

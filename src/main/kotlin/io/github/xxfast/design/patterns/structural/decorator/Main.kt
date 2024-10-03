package codes.isuru.kotlin.creational.structural.decorator

data class Vehicle(val color: String = "🟥") {
    override fun toString(): String = "$color(🚗)"
}

fun Vehicle.paint(color: String) =
    copy(color = "$color(${this.color})")

val myVehicle = Vehicle()

val myPimpVehicle = myVehicle
    .paint(color = "🟨")
    .paint(color = "🟩")
    .paint(color = "🟦")

fun main() {
    println(myPimpVehicle)
}

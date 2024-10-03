package codes.isuru.kotlin.structural.bridge

interface Colourful {
  val name: String
}

interface Identifiable {
  val identity: String
}

enum class Paint : Colourful { Blue, Green, White }
enum class Make { Mazda, Toyota, Nissan }
data class RegistrationPlate(override val identity: String) : Identifiable

sealed class Vehicle(
  private val color: Paint,
  private val plate: RegistrationPlate
) : Colourful by color, Identifiable by plate {
  class Car(color: Paint, make: Make, plate: RegistrationPlate) : Vehicle(color, plate)
  class Van(color: Paint, make: Make, plate: RegistrationPlate) : Vehicle(color, plate)
}

class Bike(private val color: Paint) : Colourful by color


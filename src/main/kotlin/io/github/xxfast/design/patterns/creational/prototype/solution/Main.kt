package codes.isuru.kotlin.creational.prototype.solution

data class Car(
  private val cost: Int,
  private val mileage: Long
)

val theOriginal = Car(10, 10)
val theCopy = theOriginal.copy()
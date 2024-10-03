package io.github.xxfast.design.patterns.kotlin.structural.adapter

import io.github.xxfast.design.java.structural.adapter.Appliance
import io.github.xxfast.design.java.structural.adapter.GPlug
import io.github.xxfast.design.java.structural.adapter.IPlug
import io.github.xxfast.design.java.structural.adapter.Iron
import io.github.xxfast.design.java.structural.adapter.Socket
import io.github.xxfast.design.java.structural.adapter.Vacuum

fun Socket<IPlug>.plug(appliance: Appliance<GPlug>) {
  val adapter: Appliance<IPlug> = object : Appliance<IPlug>() {
    override fun setPowered(powered: Boolean) {
      super.setPowered(powered)
      appliance.isPowered = powered
    }
  }

  this.plug(adapter)
}

fun main() {
  val iron = Iron()
  val vacuum: Appliance<GPlug> = Vacuum()
  val socket = Socket<IPlug>()

  socket.plug(iron)
  socket.plug(vacuum)

  socket.turnOn()

  println(vacuum.isPowered) // true
}
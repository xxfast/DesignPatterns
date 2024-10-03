package io.github.xxfast.design.java.structural.adapter;

public class Socket<T extends Plug> {
  Appliance<T> appliance;
  public void plug(Appliance<T> appliance) {
    this.appliance = appliance;
  }

  public void turnOn() {
    appliance.setPowered(true);
  }
}


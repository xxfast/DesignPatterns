package io.github.xxfast.design.java.structural.adapter;

public abstract class Appliance<T extends Plug> {
  T plug;
  public boolean isPowered = false;

  public void setPowered(boolean powered) {
    isPowered = powered;
  }
}

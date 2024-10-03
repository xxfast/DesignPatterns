package io.github.xxfast.design.java.structural.adapter.solution;

import io.github.xxfast.design.java.structural.adapter.Appliance;
import io.github.xxfast.design.java.structural.adapter.Plug;

class Adapter<M extends Plug, F extends Plug> extends Appliance<F> {
  private Appliance<M> appliance;

  void plug(Appliance<M> appliance) {
    this.appliance = appliance;
  }

  @Override
  public void setPowered(boolean powered) {
    super.setPowered(powered);
    appliance.setPowered(powered);
  }
}



package io.github.xxfast.design.java.behavioural.state.solution;

class Water extends Matter {
  State state = new Liquid();
  @Override void heatUp() { state.heatUp(this); }
  @Override void coolDown() { state.coolDown(this); }
  @Override void evaporate() { state.evaporate(this); }
  @Override void freeze() { state.freeze(this); }
  @Override void condense() { state.condense(this); }
  @Override void melt() { state.melt(this); }
  @Override void sublime() { state.sublime(this); }
  @Override void depose() { state.depose(this); }
}

package io.github.xxfast.design.patterns.behavioural.state.problem;

abstract class Matter {
  abstract void heatUp();
  abstract void coolDown();
  abstract void evaporate();
  abstract void freeze();
  abstract void condense();
  abstract void melt();
  abstract void sublime();
  abstract void depose();
}

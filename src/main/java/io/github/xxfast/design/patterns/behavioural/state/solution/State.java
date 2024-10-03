package io.github.xxfast.design.patterns.behavioural.state.solution;

abstract class State {
  abstract void heatUp(Water water);
  abstract void coolDown(Water water);

  void evaporate(Water water) {
    if (!(this instanceof Liquid)) throw new IllegalStateException("Unable to evaporate matter at state " + this);
    water.state = new Gas();
  }

  void freeze(Water water) {
    if (!(this instanceof Liquid)) throw new IllegalStateException("Unable to freeze matter at state " + this);
    water.state = new Solid();
  }

  void condense(Water water) {
    if (!(this instanceof Gas)) throw new IllegalStateException("Unable to condense matter at state " + this);
    water.state = new Liquid();
  }

  void melt(Water water) {
    if (!(this instanceof Solid)) throw new IllegalStateException("Unable to melt matter at state " + this);
    water.state = new Liquid();
  }

  void sublime(Water water) {
    if (!(this instanceof Solid)) throw new IllegalStateException("Unable to sublime matter at state " + this);
    water.state = new Gas();
  }

  void depose(Water water) {
    if (!(this instanceof Gas)) throw new IllegalStateException("Unable to depose matter at state " + this);
    water.state = new Solid();
  }
}

class Solid extends State {
  @Override void heatUp(Water water) { melt(water);}
  @Override void coolDown(Water water) { }
}

class Liquid extends State {
  @Override void heatUp(Water water) {
    evaporate(water);
  }

  @Override void coolDown(Water water) {
    freeze(water);
  }
}

class Gas extends State {
  @Override void heatUp(Water water) { }
  @Override void coolDown(Water water) { condense(water); }
}





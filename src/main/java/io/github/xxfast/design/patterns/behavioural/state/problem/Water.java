package io.github.xxfast.design.patterns.behavioural.state.problem;

import org.jetbrains.annotations.NotNull;

class Water extends Matter {
  @NotNull State state = State.Liquid;

  @Override
  void heatUp(){
    switch (state) {
      case Gas -> {}
      case Liquid -> { evaporate(); }
      case Solid -> { melt(); }
      default -> throw new IllegalStateException("Unhandled state: " + state);
    }
  }

  @Override
  void coolDown(){
    switch (state) {
      case Solid -> {}
      case Liquid -> { freeze(); }
      case Gas -> { condense(); }
      default -> throw new IllegalStateException("Unhandled state: " + state);
    }
  }

  @Override
  void evaporate() {
    if (state != State.Liquid) throw new IllegalStateException("Unable to evaporate matter at state " + state);
    state = State.Gas;
  }

  @Override
  void condense() {
    if (state != State.Gas) throw new IllegalStateException("Unable to condense matter at state " + state);

    state = State.Liquid;
  }

  @Override
  void freeze() {
    if (state != State.Liquid) throw new IllegalStateException("Unable to freeze matter at state " + state);
    state = State.Solid;
  }

  @Override
  void melt() {
    if (state != State.Solid) throw new IllegalStateException("Unable to melt matter at state " + state);
    state = State.Liquid;
  }

  @Override
  void sublime() {
    if (state != State.Solid) throw new IllegalStateException("Unable to sublime matter at state " + state);
    state = State.Gas;
  }

  @Override
  void depose(){
    if (state != State.Gas) throw new IllegalStateException("Unable to depose matter at state " + state);
    state = State.Solid;
  }
}

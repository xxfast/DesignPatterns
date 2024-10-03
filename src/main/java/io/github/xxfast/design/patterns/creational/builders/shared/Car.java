package io.github.xxfast.design.patterns.creational.builders.shared;


import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Car {
  private List<Door> doors;
  private List<Seat> seats;
  @Nullable
  private Sunroof sunroof;
  @Nullable
  private Engine engine;

  public Car(
      List<Door> doors, List<Seat> seats,
      @Nullable Sunroof sunroof, @Nullable Engine engine
  ) {
    this.doors = doors;
    this.seats = seats;
    this.sunroof = sunroof;
    this.engine = engine;
  }
}

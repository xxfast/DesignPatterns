package io.github.xxfast.design.patterns.creational.builders.solution;

import io.github.xxfast.design.patterns.creational.builders.shared.*;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

class CarBuilder {
  private List<Door> doors = List.of(new Door [] { new Door() });
  private List<Seat> seats;
  private Boolean isRegistered;
  private Boolean isInsured;
  @Nullable private Sunroof sunroof;
  private Engine engine;

  public CarBuilder(Engine engine) {
    this.engine = engine;
  }

  public CarBuilder setDoors(List<Door> doors) {
    this.doors = doors;
    return this;
  }

  public CarBuilder setSeats(List<Seat> seats) {
    this.seats = seats;
    return this;
  }

  public CarBuilder isRegistered(Boolean isRegistered) {
    this.isRegistered = isRegistered;
    return this;
  }

  public CarBuilder isInsured(Boolean isInsured) {
    this.isInsured = isInsured;
    return this;
  }

  public CarBuilder setSunroof(@Nullable Sunroof sunroof) {
    this.sunroof = sunroof;
    return this;
  }

  public CarBuilder setEngine(@Nullable Engine engine) {
    this.engine = engine;
    return this;
  }

  public Car build() {
    return new Car(this.doors, this.seats, this.sunroof, this.engine);
  }
}

public class Main {
  public static void main(String[] args) {
    CarBuilder myBuilder = new CarBuilder(new Engine());

    Car madeAGasCar = myBuilder
      .setSeats(new ArrayList<>())
      .setDoors(new ArrayList<>())
      .setSunroof(new Sunroof())
      .build();

    System.out.println(madeAGasCar);
  }
}

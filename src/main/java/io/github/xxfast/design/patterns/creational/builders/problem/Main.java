package io.github.xxfast.design.patterns.creational.builders.problem;


import io.github.xxfast.design.patterns.creational.builders.shared.Car;
import io.github.xxfast.design.patterns.creational.builders.shared.Door;
import io.github.xxfast.design.patterns.creational.builders.shared.Seat;
import io.github.xxfast.design.patterns.creational.builders.shared.Wheel;

import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    List<Door> doors = new ArrayList<>();
    List<Seat> seats = new ArrayList<>();
    Car myCar = new Car(doors, seats, null, null);
  }
}

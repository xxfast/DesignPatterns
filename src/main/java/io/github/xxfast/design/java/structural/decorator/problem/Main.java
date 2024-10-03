package io.github.xxfast.design.java.structural.decorator.problem;

enum Bed { Twin, Double, Queen, King }
enum Tub { BathTub, Jacuzzi }
enum Pool { PlungePool, SwimmingPool }

class RoomDecorator {
  int number;
  Bed bed;
  Tub tub;
  Pool pool;

  RoomDecorator(int number, Bed bed, Tub tub, Pool pool) {
    this.number = number;
    this.bed = bed;
    this.tub = tub;
    this.pool = pool;
  }

  String decorate() {
    return "Room #" + number + "\n"
        + "Bed = " + bed + ", \n"
        + "Tub = " + tub + ", \n"
        + "Pool = " + pool + ", ";
  }
}

public class Main {
  public static void main(String[] args) {
    RoomDecorator room = new RoomDecorator(42, Bed.Twin, Tub.BathTub, Pool.PlungePool);
    String decoration = room.decorate();
    System.out.println(decoration);
  }
}

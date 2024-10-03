package io.github.xxfast.design.java.structural.decorator.solution;

enum Bed {Twin, Double, Queen, King}

enum Tub {BathTub, Jacuzzi}

enum Pool {PlungePool, SwimmingPool}

abstract class RoomDecorator {
  abstract String decorate();
}

class NumberDecorator extends RoomDecorator {
  int number;

  NumberDecorator(int number) {
    this.number = number;
  }

  @Override
  String decorate() {
    return ("Room #" + number + ",\n");
  }
}

class BedDecorator extends RoomDecorator {
  RoomDecorator room;
  Bed bed;

  BedDecorator(RoomDecorator room, Bed bed) {
    this.room = room;
    this.bed = bed;
  }


  @Override
  public String decorate() {
    return room.decorate() + ("Bed = " + bed + ",\n");
  }
}

class TubDecorator extends RoomDecorator {
  RoomDecorator room;
  Tub tub;

  TubDecorator(RoomDecorator room, Tub tub) {
    this.room = room;
    this.tub = tub;
  }

  @Override
  public String decorate() {
    return room.decorate() + ("Tub = " + tub + ",\n");
  }
}

class PoolDecorator extends RoomDecorator {
  RoomDecorator room;
  Pool pool;

  PoolDecorator(RoomDecorator room, Pool pool) {
    this.room = room;
    this.pool = pool;
  }

  @Override
  public String decorate() {
    return room.decorate() + ("Pool = " + pool + ",\n");
  }
}

public class Main {
  public static void main(String[] args) {
    RoomDecorator room = new PoolDecorator(
        new TubDecorator(
            new BedDecorator(
                new NumberDecorator(42),
                Bed.Twin
            ),
            Tub.BathTub
        ),
        Pool.PlungePool
    );

    String decoration = room.decorate();
    System.out.println(decoration);
  }
}

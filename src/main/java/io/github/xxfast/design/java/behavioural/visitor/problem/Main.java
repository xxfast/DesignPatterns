package io.github.xxfast.design.java.behavioural.visitor.problem;

class Compartment { }
class Kitchen extends Compartment { }
class Stairs extends Compartment { }
class Boiler extends Compartment { }
class Bulkhead extends Compartment { }

class Room extends Compartment {
  String name;
  final Compartment[] compartments;

  public Room(
      String name,
      Compartment[] compartments
  ) {
    this.name = name;
    this.compartments = compartments;
  }
}

class Ghost {
  String haunt(Compartment compartment) { return "🤔 The ghost is lost";}
  String haunt(Kitchen kitchen) { return "🍽️ The dishes are rattling"; }
  String haunt(Stairs stairs) { return "🪜 the stairs are creaking";}
  String haunt(Boiler boiler) { return "🫥 the boiler is clinking"; }
  String haunt(Bulkhead bulkhead) { return "🚪 the bulkhead doors are rattling"; }

  String haunt(Room room) {
    StringBuilder builder =
        new StringBuilder("👻 Noises coming from the " + room.name);

    builder.append("\n");
    for (int i = 0; i < room.compartments.length; i++) {
      Compartment compartment = room.compartments[i];
      builder.append(haunt(compartment));
      if (i != room.compartments.length - 1) builder.append("\n");
    }
    return builder.toString();
  }
}

public class Main {
  public static void main(String[] args) {
    Room basement = new Room(
        "basement",
        new Compartment[]{ new Stairs(), new Boiler(), new Bulkhead() }
    );

    Kitchen kitchen = new Kitchen();

    Room house = new Room("house", new Compartment[]{ basement, kitchen });

    Ghost ghost = new Ghost();
    System.out.println(ghost.haunt(house));
  }
}

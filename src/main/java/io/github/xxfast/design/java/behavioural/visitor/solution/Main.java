package io.github.xxfast.design.java.behavioural.visitor.solution;

interface Hauntable {
    String haunt(Haunting haunting);
}

interface Haunting {
    String haunt(Kitchen kitchen);
    String haunt(Stairs stairs);
    String haunt(Boiler boiler);
    String haunt(Bulkhead bulkhead);
    String haunt(Room hauler);
}

abstract class Compartment implements Hauntable { }

class Kitchen extends Compartment implements Hauntable {
    @Override
    public String haunt(Haunting haunting) {
        return haunting.haunt(this);
    }
}

class Stairs extends Compartment implements Hauntable {
    @Override
    public String haunt(Haunting haunting) {
        return haunting.haunt(this);
    }
}

class Boiler extends Compartment implements Hauntable {
    @Override
    public String haunt(Haunting haunting) {
        return haunting.haunt(this);
    }
}

class Bulkhead extends Compartment implements Hauntable {
    @Override
    public String haunt(Haunting haunting) {
        return haunting.haunt(this);
    }
}

class Room extends Compartment implements Hauntable {
    final String name;
    final Compartment[] compartments;

    public Room(String name, Compartment[] compartments) {
      this.name = name;
      this.compartments = compartments;
    }

    @Override
    public String haunt(Haunting haunting) {
        return haunting.haunt(this);
    }
}

class Ghost implements Haunting {
    @Override
    public String haunt(Kitchen kitchen) {
        return "🍽️ The ghost is rattling the dishes";
    }

    @Override
    public String haunt(Stairs stairs) {
        return "🪜 the stairs are creaking";
    }

    @Override
    public String haunt(Boiler boiler) {
        return "🫥 the boiler is clinking";
    }

    @Override
    public String haunt(Bulkhead bulkhead) {
        return "🚪 the bulkhead doors are rattling";
    }

    @Override
    public String haunt(Room room) {
        StringBuilder builder =
            new StringBuilder("👻 Noises coming from the " + room.name);
        builder.append("\n");
        for (int i = 0; i < room.compartments.length; i++) {
            builder.append(room.compartments[i].haunt(this));
            if (i != room.compartments.length - 1) builder.append("\n");
        }
        return builder.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Room basement = new Room(
            "basement",
            new Compartment[]{
                new Stairs(),
                new Boiler(),
                new Bulkhead()
            }
        );

        Kitchen kitchen = new Kitchen();

        Room house = new Room("house", new Compartment[]{basement, kitchen});

        Ghost ghost = new Ghost();
        System.out.println(ghost.haunt(house));
    }
}

package io.github.xxfast.design.java.structural.adapter.solution;

import io.github.xxfast.design.java.structural.adapter.*;

public class Main {
  public static void main(String[] args) {
    Iron iron = new Iron();
    Vacuum vacuum = new Vacuum();
    Socket<IPlug> socket = new Socket<>();

    socket.plug(iron);

    Adapter<GPlug, IPlug> adapter = new Adapter<>();
    adapter.plug(vacuum);
    socket.plug(adapter);

    socket.turnOn();

    System.out.println(vacuum.isPowered()); // true
  }
}

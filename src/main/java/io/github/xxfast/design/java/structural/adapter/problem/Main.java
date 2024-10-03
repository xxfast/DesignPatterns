package io.github.xxfast.design.java.structural.adapter.problem;


import io.github.xxfast.design.java.structural.adapter.IPlug;
import io.github.xxfast.design.java.structural.adapter.Iron;
import io.github.xxfast.design.java.structural.adapter.Socket;
import io.github.xxfast.design.java.structural.adapter.Vacuum;

public class Main {
  public static void main(String[] args) {
    Iron iron = new Iron();
    Vacuum vacuum = new Vacuum();

    Socket<IPlug> socket = new Socket<>();

    socket.plug(iron);
    // socket.plug(vacuum); // Compilation error :(
    socket.turnOn();

    System.out.println(vacuum.isPowered()); // false
  }
}

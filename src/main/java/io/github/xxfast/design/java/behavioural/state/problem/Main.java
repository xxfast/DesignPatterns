package io.github.xxfast.design.java.behavioural.state.problem;

public class Main {
  public static void main(String[] args) {
    Water puddle = new Water(); // Liquid
    System.out.println(puddle.state);

    puddle.coolDown(); // Solid
    System.out.println(puddle.state);

    puddle.melt(); // Liquid
    System.out.println(puddle.state);

    puddle.heatUp(); // Gas
    System.out.println(puddle.state);

    puddle.evaporate(); // Throws!
  }
}

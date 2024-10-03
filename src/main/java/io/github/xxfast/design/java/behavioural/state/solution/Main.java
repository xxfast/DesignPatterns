package io.github.xxfast.design.java.behavioural.state.solution;

public class Main {
  public static void main(String[] args) {
    Water puddle = new Water(); // Liquid
    System.out.println(puddle.state);

    puddle.heatUp(); // Gas
    System.out.println(puddle.state);

    puddle.depose(); // Solid
    System.out.println(puddle.state);

    puddle.melt(); // Liquid
    System.out.println(puddle.state);

    puddle.sublime(); // Throws!
  }
}

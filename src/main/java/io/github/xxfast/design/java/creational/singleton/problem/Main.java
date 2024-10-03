package io.github.xxfast.design.java.creational.singleton.problem;

import io.github.xxfast.design.java.creational.singleton.Chef;

final class MasterChef extends Chef {
  public MasterChef() {
        super("The One Who Remained", Integer.MAX_VALUE);
  }
}

public class Main {
    public static void main(String[] args) {
        Chef chef = new MasterChef();
        Chef anotherChef = new MasterChef();
    }
}

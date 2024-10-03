package io.github.xxfast.design.java.creational.singleton.solution;

import io.github.xxfast.design.java.creational.singleton.Chef;

final class MasterChef extends Chef {
    private static volatile MasterChef instance;

    private MasterChef() {
        super("The One Who Remained", Integer.MAX_VALUE);
    }

    public static MasterChef getInstance() {
        MasterChef previousInstance = instance;
        if(previousInstance != null) return previousInstance;
        synchronized (MasterChef.class){
            if(instance == null){
                instance = new MasterChef();
            }
            return instance;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Chef chef = MasterChef.getInstance();
        Chef anotherChef = MasterChef.getInstance();
        assert chef == anotherChef;
    }
}

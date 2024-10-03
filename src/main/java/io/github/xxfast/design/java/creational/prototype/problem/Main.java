package io.github.xxfast.design.java.creational.prototype.problem;

import io.github.xxfast.design.java.creational.prototype.Ingredient;

import java.util.List;

import static io.github.xxfast.design.java.creational.prototype.Ingredient.*;

class Dish {
  private String name;
  private final List<Ingredient> ingredients;
  private final int calories;

  Dish(String name, List<Ingredient> ingredients, int calories) {
    this.name = name;
    this.ingredients = ingredients;
    this.calories = calories;
  }
}

public class Main {
  public static void main(String[] args) {
    Dish theOriginal = new Dish(
        "Ratatouille",
        List.of(Eggplant, Zucchini, Tomatoes, Carrot, Garlic, Onion, Herbs, OliveOil),
        140
    );
    // Car theCopy = new Car(theOriginal.cost, theOriginal.mileage);
  }
}

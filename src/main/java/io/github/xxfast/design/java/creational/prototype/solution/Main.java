package io.github.xxfast.design.java.creational.prototype.solution;

import io.github.xxfast.design.java.creational.prototype.Ingredient;
import java.util.List;
import static io.github.xxfast.design.java.creational.prototype.Ingredient.*;

class Dish implements Cloneable {
  private final String name;
  private final List<Ingredient> ingredients;
  private final long calories;

  Dish(String name, List<Ingredient> ingredients, long calories) {
    this.name = name;
    this.ingredients = ingredients;
    this.calories = calories;
  }

  @SuppressWarnings("MethodDoesntCallSuperMethod") // 🤷‍
  @Override
  public Dish clone() {
    return new Dish(this.name, this.ingredients, this.calories);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Dish car = (Dish) o;
    if (!name.equals(car.name)) return false;
    if (ingredients != car.ingredients) return false;
    return calories == car.calories;
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + ingredients.hashCode();
    result = 31 * result + Long.hashCode(calories);
    return result;
  }
}

public class Main {
  public static void main(String[] args) {
    Dish theOriginal = new Dish(
        "Ratatouille",
        List.of(Eggplant, Zucchini, Tomatoes, Carrot, Garlic, Onion, Herbs, OliveOil),
        140
    );

    Dish theCopy = theOriginal.clone();
  }
}

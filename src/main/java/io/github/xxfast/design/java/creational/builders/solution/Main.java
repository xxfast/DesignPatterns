package io.github.xxfast.design.java.creational.builders.solution;

import io.github.xxfast.design.java.creational.builders.shared.*;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

class CakeBuilder {
  private List<Layers> layers = List.of(new Layers[] { new Layers() });
  private List<Candle> candles;
  private boolean isGluttonFree;
  private boolean isDairyFree;
  @Nullable private Topper topper;
  private Sponge sponge;

  public CakeBuilder(Sponge sponge) {
    this.sponge = sponge;
  }

  public CakeBuilder setDoors(List<Layers> layers) {
    this.layers = layers;
    return this;
  }

  public CakeBuilder setCandles(List<Candle> candles) {
    this.candles = candles;
    return this;
  }

  public CakeBuilder isGluttonFree(Boolean isGluttonFree) {
    this.isGluttonFree = isGluttonFree;
    return this;
  }

  public CakeBuilder isDairyFree(Boolean isDairyFree) {
    this.isDairyFree = isDairyFree;
    return this;
  }

  public CakeBuilder setTopper(@Nullable Topper topper) {
    this.topper = topper;
    return this;
  }

  public CakeBuilder setSponge(@Nullable Sponge sponge) {
    this.sponge = sponge;
    return this;
  }

  public Cake bake() {
    return new Cake(this.layers, this.candles, this.isGluttonFree, this.isDairyFree, this.topper, this.sponge);
  }
}

public class Main {
  public static void main(String[] args) {
    CakeBuilder builder = new CakeBuilder(new Sponge());

    Cake lie = builder
      .setCandles(new ArrayList<>())
      .setDoors(new ArrayList<>())
      .setTopper(new Topper())
      .bake();

    System.out.println(lie);
  }
}

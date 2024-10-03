package io.github.xxfast.design.patterns.creational.builders.shared;


import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Cake {
  private List<Layers> layers;
  private List<Candle> candles;
  private boolean isGluttonFree;
  private boolean isDairyFree;
  @Nullable private Topper topper;
  @Nullable private Sponge sponge;

  public Cake(
      List<Layers> layers, List<Candle> candles,
      boolean isGluttonFree, boolean isDairyFree,
      @Nullable Topper topper, @Nullable Sponge sponge
  ) {
    this.layers = layers;
    this.candles = candles;
    this.isGluttonFree = isGluttonFree;
    this.isDairyFree = isDairyFree;
    this.topper = topper;
    this.sponge = sponge;
  }
}

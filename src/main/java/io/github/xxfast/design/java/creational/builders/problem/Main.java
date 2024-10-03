package io.github.xxfast.design.java.creational.builders.problem;


import io.github.xxfast.design.java.creational.builders.shared.Cake;
import io.github.xxfast.design.java.creational.builders.shared.Layers;
import io.github.xxfast.design.java.creational.builders.shared.Candle;

import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    List<Layers> layers = new ArrayList<>();
    List<Candle> candles = new ArrayList<>();
    Cake cake = new Cake(layers, candles, false, true, null, null);
  }
}

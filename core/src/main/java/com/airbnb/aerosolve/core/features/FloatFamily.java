package com.airbnb.aerosolve.core.features;

import java.util.HashMap;
import java.util.Map;
import lombok.Getter;

public class FloatFamily extends FeatureFamily<Double> {
  @Getter
  private final Map<String, Double> features;

  public FloatFamily(String familyName) {
    super(familyName);
    features = new HashMap<>();
  }

  protected  void put(String name, Double feature) {
    features.put(nameTransform(name), feature);
  }
}

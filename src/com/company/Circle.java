package com.company;

public class Circle extends GeometricObject {

  private double radius;

  public Circle(double radius) {

    this.radius = radius;

  }

  public double GetArea() {

    return radius * radius * Math.PI;

  }
}

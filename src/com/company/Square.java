package com.company;

public class Square extends GeometricObject implements Colorable {
  private double width;

  public Square(double width) {

    this.width = width;

  }

  public double GetArea() {

    return width*width;

  }

  public String howToColor() {
  return "Color all 4 sides";
  }
}

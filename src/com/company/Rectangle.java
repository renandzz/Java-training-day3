package com.company;

public class Rectangle extends GeometricObject {

  private double width,height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double GetArea(){

    return width*height;

  }
}

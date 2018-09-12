package com.company;

public class Question3 {
  public static void main(String[] args) {

    System.out.println("3. Write a test program that creates an array of five GeometricObjects. For each object in the\n"
        + "array, invoke its howToColor method if it is colorable.");

    GeometricObject[] squares = {new Square(1), new Square(2),
        new Square(3), new Square(4), new Square(5)};


    for (int i = 0; i < squares.length; i++) {

      System.out.println("shape" + (i + 1));
      if (squares[i] instanceof Colorable) {
        System.out.println("How to color: "+((Colorable)squares[i]).howToColor());
      }
    }
  }
}

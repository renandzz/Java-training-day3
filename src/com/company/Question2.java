package com.company;

public class Question2 {
  public static void main(String[] args) {

    System.out.println("Design an interface named Colorable with a void method named howToColor(). Every\n"
        + "class of a colorable object must implement the Colorable interface. Design a class named\n"
        + "Square that extends GeometricObject and implements Colorable. Implement\n"
        + "howToColor to display a message on how to color the square.");

    Square square1 = new Square(5);
    System.out.println("How to color a square1: "+ square1.howToColor());
  }
}

package com.company;

public class Question1 {
  public static void main(String[] args) {
    // write your code here
    System.out.println("1. Modify the GeometricObject class to implement the Comparable interface, and\n"
        + "define a static max method in the GeometricObject class for finding the larger of two\n"
        + "GeometricObject object.\n"
        + "GeometricObject class. Write a test program that uses the max method to find the\n"
        + "larger of two circles and the larger of two rectangles.");

    Circle circle1 = new Circle(15);
    Circle circle2 = new Circle(10);

    // Display circle1
    System.out.println("\nCircle 1: ");
    System.out.println(circle1.toString());

    // Display circle2
    System.out.println("\nCircle 2: ");
    System.out.println(circle2.toString());

    // Display larger circle
    System.out.println("\nIf both circles compared :  ");
    System.out.println(circle1.Max(circle1, circle2));


    // Create two Rectangle objects
    Rectangle rectangle1 = new Rectangle(4, 5);
    Rectangle rectangle2 = new Rectangle(4.2, 5);

    // Display circle1
    System.out.println("\nRectangle 1: ");
    System.out.println(rectangle1.toString());

    // Display circle2
    System.out.println("\nRectangle 2: ");
    System.out.println(rectangle2.toString());

    // Display larger circle
    System.out.println("\nIf both circles compared : ");
    System.out.println((rectangle1.Max(rectangle1, rectangle2)));
  }
}

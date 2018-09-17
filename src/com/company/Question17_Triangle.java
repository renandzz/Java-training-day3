package com.company;

import java.util.Scanner;

public class Question17_Triangle {
  public static void main(String[] args) {

    System.out.println(
        "17. Use the Triangle class defined in previous exercise. In a triangle, the sum of two side is\n"
            + "greater than the other side. The Triangle class must adhere to this rule. Create the \n"
            + "IllegalTriangleException class, and modify the constructor of the Triangle class\n"
            + "to throw an IllegalTriangleException object if a triangle is created with sides that\n"
            + "violate the rule, as follows:");

    Scanner reader = new Scanner(System.in);  // Reading from System.in
    System.out.print("Enter side1: ");
    double side1 = reader.nextDouble();
    System.out.print("Enter side2: ");
    double side2 = reader.nextDouble();
    System.out.print("Enter side3: ");
    double side3 = reader.nextDouble();
    reader.close();

    try {
      Triangle triangle1 = new Triangle(side1, side2, side3);
      System.out.println(triangle1);
    } catch (IllegalTriangleException e) {
      System.out.println(e.toString());
    }

  }
}

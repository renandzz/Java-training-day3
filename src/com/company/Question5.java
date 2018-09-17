package com.company;

public class Question5 {
  public static void main(String[] args) throws CloneNotSupportedException {
    Octagon octagon1 = new Octagon(5);

    // Create new object using the clone method
    Octagon octagon2 = (Octagon)octagon1.clone();

    // Compare the two object using compareTo method
    int result = (octagon1.compareTo(octagon2));
    if (result == 1)
      System.out.println("Octagon is greater than its clone.");
    else if (result == -1)
      System.out.println("Octagon is less than its clone.");
    else
      System.out.println("Octagon is equal to its clone.");
  }
}

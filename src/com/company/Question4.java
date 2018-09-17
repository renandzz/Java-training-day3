package com.company;

public class Question4 {
  public static void main(String[] args) {

    System.out.println("4. Create a class named ComparableRectangle that extends Rectangle and implements\n"
        + "Comparable. Draw the UML diagram and implement the compareTo method to compare\n"
        + "the rectangles on the basic of area. Write a test class to find the larger of two instances of -\n"
        + "ComparableRectangle objects.");

    ComparableRectangle CR1 = new ComparableRectangle (3,4);

    ComparableRectangle CR2 = new ComparableRectangle (5,6);

    if(CR1.compareTo(CR2) == 0){
      System.out.println("Both Rectangle is equal size");
    }else if(CR1.compareTo(CR2) == 1){
      System.out.println("Comparable Rectangle 1 is larger");
    }else{
      System.out.println("Comparable Rectangle 1 is smaller and 2 is larger");
    }
  }
}

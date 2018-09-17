package com.company;

import java.util.Date;

public class Question6 extends FindLargest {
  public static void main(String[] args) {

    // Arrays
    Integer[] intArray = { 10,9,8,7,6,5,4,3,2,1 };
    String[] stringArray = { "c", "b", "a", "d", "e", "f", "j", "h", "i",
        "g" };
    java.util.Date[] dateArray = new Date[10];

    for (int j = 0; j < 10; j++)
      dateArray[j] = new java.util.Date();

    System.out.println("6. Write a method that returns the largest object in an array of objects. The method signature\n"
        + "is :\n"
        + "public static Object max(Object [] a)\n"
        + "All the objects are instances of the Comparable interface. The order of the objects in the\n"
        + "array is determined using the compareTo method. Write a test program that creates an\n"
        + "array of ten strings, an array of ten integers, and an array of ten dates, and finds the largest\n"
        + "string, integer, and date in the arrays.");

    System.out.println("Largest Integer = " + max(intArray));
    System.out.println("Largest String = " + max(stringArray));
    System.out.println("Largest Date = " + max(dateArray));
  }
}

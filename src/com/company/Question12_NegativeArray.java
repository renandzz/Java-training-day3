package com.company;

import java.util.Scanner;

public class Question12_NegativeArray {
  public static void main(String[] args) {

    System.out.println("12. Write an application program that prompts the user to enter a number to use as an array\n"
        + "size, then attempt to declare an array using the entered size. If the array is created\n"
        + "successfully, display an appropriate message. Use a catch block that executes if the array\n"
        + "size is non-numeric or negative. Save the program as NegativeArray.java");


    Scanner reader = new Scanner(System.in);  // Reading from System.in
    System.out.println("Enter a number: ");
    String n = reader.next(); // Scans the next token of the input as an int.
//once finished
    reader.close();

    try {
      Integer[] intArray = new Integer[Integer.parseInt(n)];
    }catch (NumberFormatException|NegativeArraySizeException e){
      System.out.println("please fill with number or non negative number of array thanks");
    }
  }
}

package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Question19 {
  public static void main(String[] args) {

    int tampung=0;

    System.out.println(
        "19. Write an application that reads a file of numbers and displays their sum. The file name should\n"
            + "be supplied at the command line.");

    File file1 = new File("/Users/rheist/Documents/GitHub/Java-training-day3/src/com/company/dummynumber.txt");

    try {
      BufferedReader in = (new BufferedReader(new FileReader(file1)));

      int ch;
      while ((ch = in.read()) != -1)
      {
        if (Character.isDigit(ch))
        {
          tampung += Character.getNumericValue(ch);
        }

      }
      in.close();


      System.out.println("Sum :"+ tampung);
      System.out.println("Filename : dummynumber.txt");
    } catch (IOException e) {
      System.out.println(e.toString());
    }
  }
}

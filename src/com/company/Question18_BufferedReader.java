package com.company;

import java.io.*;

public class Question18_BufferedReader {
  public static void main(String[] args) {

    System.out.println(
        "18. Write a method that accepts a BufferedReader designating an input and a\n"
            + "PrintWriter designating an output file as parameters. It should copy the input file to the\n"
            + "output, converting all letters to upper case.");

    File file1 = new File("/Users/rheist/Documents/GitHub/Java-training-day3/src/com/company/Circle.java");
    File file2 = new File("/Users/rheist/Documents/GitHub/Java-training-day3/src/com/company/final.txt");
    try {
      BufferedReader in = (new BufferedReader(new FileReader(file1)));
      PrintWriter out = (new PrintWriter(new FileWriter(file2)));
      int ch;
      while ((ch = in.read()) != -1)
      {
        if (Character.isLowerCase(ch))
        {
          ch=Character.toUpperCase(ch);
        }
        out.write(ch);
      }
      in.close();
      out.close();

      System.out.println("sukses!");
    } catch (IOException e) {
      System.out.println(e.toString());
    }
  }
}

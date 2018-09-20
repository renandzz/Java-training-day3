package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Question20 {
  public static void main(String[] args) {

    int tampung=0;

    System.out.println(
        "You are the owner of a hardware store and need to keep an inventory that can tell you what\n"
            + "different tools you stock, how many of each you have on hand and the cost of each one.\n"
            + "Write a program that initializes the random-access file “hardware.dat” to 100 empty\n"
            + "record and lets you input the data concerning each tool, list all your tools, delete a record\n"
            + "for a tool that you no longer have and update any information in the file. The tool\n"
            + "identification number should be the record number");

    File file1 = new File("/Users/rheist/Documents/GitHub/Java-training-day3/src/com/company/record.txt");

    initializeFile();
  }


  public static void initializeFile(){
    File file1 = new File("/Users/rheist/Documents/GitHub/Java-training-day3/src/com/company/record.txt");

    try {
      int ch;
      PrintWriter out = (new PrintWriter(new FileWriter(file1)));
      Record blankItem = new Record();

      for (int i = 0; i <100 ; i++) {
        out.write(blankItem.toString());
        out.println();
      }

      out.close();

      System.out.println("Filename : record.txt");
    } catch (IOException e) {
      System.out.println(e.toString());
    }
  }

}

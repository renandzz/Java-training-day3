package com.company;

public class Question11_TryToParseString {
  public static void main(String[] args) {

    System.out.println("11. The Integer.parseInt() method requires an integer argument. Write a program in which you\n"
        + "try to parse a String. Catch the NumberFormatExceptionError that is thrown, and then\n"
        + "display an appropriate error message. Save the program as TryToParseString.java. ");

    String str = "asd";
    try {
      System.out.println(Integer.parseInt(str));
    }catch (NumberFormatException e){
      System.out.println("Please fill with integer not string");
    }

  }
}

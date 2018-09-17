package com.company;

import java.util.Scanner;

public class Question14_TestGrade {
  public static void main(String[] args) {

    System.out.println(
        "14. Write a program that displays a student ID number and asks the user to enter a test letter\n"
            + "grade for the student. Create an Exception class named GradeException, and throw a\n"
            + "GradeException if the user does not enter a valid letter grade. Catch the GradeException\n"
            + "and then display an appropriate message. Save the program as TestGrade.java");

    Scanner reader = new Scanner(System.in);  // Reading from System.in
    System.out.println("Enter an ID number: ");
    String id = reader.next();
    System.out.println("Enter a letter grade: ");
    Character lettergrade = reader.next().charAt(0);
    reader.close();

    try {
      Student student1 = new Student(id,lettergrade);
      System.out.println(student1);
    } catch (GradeException e) {
      System.out.println("Grade is not letter");
    }

  }
}

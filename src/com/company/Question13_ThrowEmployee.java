package com.company;

import java.util.Scanner;

public class Question13_ThrowEmployee {
  public static void main(String[] args) {

    System.out.println("13. Create an EmployeeException class whose constructor receives a String that consists of an\n"
        + "employee's ID and pay rate. Create an Employee class with two fields, idNum and\n"
        + "hourlyWage. The Employee constructor requires values for bothfields. Upon construction,\n"
        + "throw an EmployeeException id the hourlyWage is less than $6.00 or over $50.00 Write a\n"
        + "program that establishes at least three Employees with hourlyWages that are above, below,\n"
        + "and within the allowed range. Save the program as ThrowEmployee.java.");

    try{
      Employee employee1 = new Employee("1",3);
      System.out.println(employee1);
    }catch (EmployeeException e){
      System.out.println("Incorrect wage");
    }

    try{
      Employee employee2 = new Employee("2",9);
      System.out.println(employee2);
    }catch (EmployeeException e){
      System.out.println("Incorrect wage");
    }

    try{
      Employee employee3 = new Employee("3",90);
      System.out.println(employee3);
    }catch (EmployeeException e){
      System.out.println("Incorrect wage");
    }



  }
}

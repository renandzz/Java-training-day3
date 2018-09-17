package com.company;

import java.util.Scanner;

public class Question15_Catalog {
  public static void main(String[] args) {

    System.out.println(
        "15. Gadgets by Mail sells many interesting items through its catalogs. Write a program that\n"
            + "prompts the user for an item number and quantity ordered. Create an Exception class named\n"
            + "OrderException, and throw an OrderException if the user does not enter a valid item\n"
            + "number (at least 111, but no more than 999) or quantity (at least 1, but no more than 50).\n"
            + "Catch the OrderException and display an appropriate message. If the item number and\n"
            + "quantity are valid, display the final price, which is $2.00 per item, no matter what the item\n"
            + "number is.");

    Scanner reader = new Scanner(System.in);  // Reading from System.in
    System.out.println("Enter an Item number: ");
    Integer id = reader.nextInt();
    System.out.println("Enter quantity of the item: ");
    Integer quantity = reader.nextInt();
    reader.close();

    try {
      Item item1 = new Item(id,quantity);
      System.out.println(item1);
    } catch (OrderException e) {
      System.out.println(e.toString());
    }

  }
}

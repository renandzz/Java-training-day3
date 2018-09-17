package com.company;

public class Item {
  private int idNum;
  private int quantity;

  public int getIdNum() {
    return idNum;
  }

  public void setIdNum(int idNum) {
    this.idNum = idNum;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public Item(int idNum, int quantity) throws OrderException{
    if ((idNum < 111 | idNum > 999) | (quantity<1 | quantity >50)){
      throw new OrderException("Quantity or id number is not good");
    }
    this.idNum = idNum;
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "Item{" +
        "idNum=" + idNum +
        ", quantity=" + quantity +
        "Final price = 2.00$";
  }
}

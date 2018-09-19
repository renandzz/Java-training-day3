package com.company;

public class Record {
  private int recordNum;
  private char toolName[25];
  private int quantity;
  private double cost;

  public int getRecordNum() {
    return recordNum;
  }

  public void setRecordNum(int recordNum) {
    this.recordNum = recordNum;
  }

  public char[] getToolName() {
    return toolName;
  }

  public void setToolName(char[] toolName) {
    this.toolName = toolName;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }
}

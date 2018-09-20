package com.company;

public class Record {
  private int recordNum;
  private String toolName;
  private int quantity;
  private double cost;

  public int getRecordNum() {
    return recordNum;
  }

  public void setRecordNum(int recordNum) {
    this.recordNum = recordNum;
  }

  public String getToolName() {
    return toolName;
  }

  public void setToolName(String toolName) {
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

  public Record(int recordNum, String toolName, int quantity, double cost) {
    this.recordNum = recordNum;
    this.toolName = toolName;
    this.quantity = quantity;
    this.cost = cost;
  }

  public Record() {
    setRecordNum(0);
    setToolName(" ");
    setQuantity(0);
    setCost(0);
  }

  @Override
  public String toString() {
    return recordNum +
        "  " + toolName +
        "  " +quantity +
        "  " + cost;
  }
}

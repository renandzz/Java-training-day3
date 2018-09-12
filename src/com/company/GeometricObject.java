package com.company;

public abstract class GeometricObject implements Comparable<GeometricObject> {

  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;

  /**
   * Construct a default geometric object
   */
  public GeometricObject() {
    dateCreated = new java.util.Date();
  }

  /**
   * Return color
   */
  public String getColor() {
    return color;
  }

  /**
   * Set a new color
   */
  public void setColor(String color) {
    this.color = color;
  }

  /**
   * Return filled. Since filled is boolean, so, the get method name is isFilled
   */
  public boolean isFilled() {
    return filled;
  }

  /**
   * Set a new filled
   */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /**
   * Get dateCreated
   */
  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  /**
   * Return a string representation of this object
   */
  public String toString() {
    return "created on " + dateCreated + "\ncolor : " + color +
        " and filled : " + filled;
  }

  public abstract double GetArea();

  public int compareTo(GeometricObject o) {
    if (GetArea() > o.GetArea())
      return 1;
    else if (GetArea() < o.GetArea())
      return -1;
    else
      return 0;
  }
  public static String Max(GeometricObject object1, GeometricObject object2){
    if (object1.compareTo(object2) == 0){
      return "Object 1 and Object 2 have equal area";
    }else if(object1.compareTo(object2) == 1){
      return "Object 1 is larger";
    }else{
      return "Object 1 is smaller";
    }

  }

}

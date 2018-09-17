package com.company;

public class Octagon extends GeometricObject implements Comparable<GeometricObject>, Cloneable {

  private double side;

  public Octagon(double side) {

    this.side = side;

  }

  public double GetArea() {
    return (2 + (4 / Math.sqrt(2))) * side * side;
  }

  @Override
  public int compareTo(GeometricObject o) {
    if (GetArea() ==  o.GetArea())
    {
      return 0;
    } else if (GetArea() > o.GetArea())
    {
      return 1;
    } else
    {
      return -1;
    }
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}

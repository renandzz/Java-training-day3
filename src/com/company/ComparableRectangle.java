package com.company;

public class ComparableRectangle extends Rectangle implements Comparable<GeometricObject> {

  public ComparableRectangle(double width, double height) {
    super(width, height);
  }

  @Override
  public int compareTo(GeometricObject o) {
    double getarea = super.GetArea();
    if(getarea == (o).GetArea()){
      return  0;
    }else if(getarea > (o).GetArea()){
      return 1;
    }else{
      return -1;
    }
  }
}

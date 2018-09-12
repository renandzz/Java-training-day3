package com.company;

public class ComparableRectangle extends Rectangle implements Comparable {

  public ComparableRectangle(double width, double height) {
    super(width, height);
  }

  @Override
  public int compareTo(Object o) {
    double getarea = super.GetArea();
    if(getarea == ((ComparableRectangle) o).GetArea()){
      return  0;
    }else if(getarea > ((ComparableRectangle) o).GetArea()){
      return 1;
    }else{
      return 0;
    }
  }
}

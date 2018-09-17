package com.company;

import java.util.Date;

public class FindLargest implements Comparable {

  String largeststr;
  Integer largestint;
  Date largestdate;



  public static Object max(Object [] a){
    Object largest = a[0];

    for (int i = 0; i < a.length; i++) {

      if (((Comparable) a[i]).compareTo(largest) > 0) {
        largest = a[i];
      }
    }

    return largest;
  }

  @Override
  public int compareTo(Object o) {
    if (o instanceof String){
      if((this.largeststr.length() == ((String) o).length())){
        return  0;
      }else if((this.largeststr.length() > ((String) o).length())){
        return 1;
      }else{
        return -1;
      }
    }else if (o instanceof Integer){
      if((this.largestint == o)) {
        return  0;
      }else if((this.largestint > (Integer)o)){
        return 1;
      }else{
        return -1;
      }
    }else if(o instanceof Date){
      if((this.largestdate.getTime() == ((Date) o).getTime())) {
        return  0;
      }else if((this.largestdate.getTime() > ((Date) o).getTime())){
        return 1;
      }else{
        return -1;
      }
    }else{
      return 0;
    }

  }
}

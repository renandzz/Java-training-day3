package com.company;

import java.math.BigDecimal;

public class Employee {
private String idNum;
private Integer hourlyWage;

  public String getIdNum() {
    return idNum;
  }

  public void setIdNum(String idNum) {
    this.idNum = idNum;
  }

  public Integer getHourlyWage() {
    return hourlyWage;
  }

  public void setHourlyWage(Integer hourlyWage) {
    this.hourlyWage = hourlyWage;
  }

  public Employee(String idNum, Integer hourlyWage) throws EmployeeException {
    if(hourlyWage < 6 || hourlyWage >50){
      throw (new EmployeeException("Wage is not in range of 6-50"));
    }
    this.idNum = idNum;
    this.hourlyWage = hourlyWage;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "idNum='" + idNum + '\'' +
        ", hourlyWage=" + hourlyWage +
        '}';
  }
}

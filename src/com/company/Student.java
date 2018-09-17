package com.company;

public class Student {
  private String idNum;
  private Character letterGrade;

  public String getIdNum() {
    return idNum;
  }

  public void setIdNum(String idNum) {
    this.idNum = idNum;
  }

  public Character getLetterGrade() {
    return letterGrade;
  }

  public void setLetterGrade(Character letterGrade) {
    this.letterGrade = letterGrade;
  }

  public Student(String idNum, Character letterGrade) throws GradeException
  {
    if(Character.isLetter(letterGrade)){
      this.idNum = idNum;
      this.letterGrade = letterGrade;
    }else{
      throw new GradeException("Please use letter for the student grade");
    }
  }

  @Override
  public String toString() {
    return "Student{" +
        "idNum='" + idNum + '\'' +
        ", letterGrade=" + letterGrade +
        '}';
  }
}

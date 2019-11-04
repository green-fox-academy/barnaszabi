package com.barnaszabi.foxclub.model;

public enum Trick {
  JAVA("Code in Java"),
  HTML("Write HTML"),
  CSS("Write CSS"),
  PYTHON("Code in python"),
  C_SHARP("Code in C#");


  private String status;

  Trick(String s) {
    status = s;
  }

  public String getStatus() {
    return status;
  }
}

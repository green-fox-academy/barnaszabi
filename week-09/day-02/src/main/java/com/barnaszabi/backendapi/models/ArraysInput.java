package com.barnaszabi.backendapi.models;

public class ArraysInput {
  private String what;
  private int[] numbers;

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }

  public ArraysInput(String what, int[] numbers) {
    this.what = what;
    this.numbers = numbers;
  }

  public ArraysInput() {
  }
}

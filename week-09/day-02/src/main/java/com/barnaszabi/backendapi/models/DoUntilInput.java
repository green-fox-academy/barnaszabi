package com.barnaszabi.backendapi.models;

public class DoUntilInput {
  private int until;

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }

  public DoUntilInput() {
  }

  public DoUntilInput(int until) {
    this.until = until;
  }
}

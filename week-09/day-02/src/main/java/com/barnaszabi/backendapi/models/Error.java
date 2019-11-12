package com.barnaszabi.backendapi.models;

public class Error {
  private String error;

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public Error() {
  }

  public Error(String error) {
    this.error = error;
  }
}

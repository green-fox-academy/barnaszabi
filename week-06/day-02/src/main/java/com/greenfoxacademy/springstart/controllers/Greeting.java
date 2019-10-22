package com.greenfoxacademy.springstart.controllers;

public class Greeting {
  private long greetingCounter;
  private String content;

  public long getGreetingCounter() {
    return greetingCounter;
  }

  public String getContent() {
    return content;
  }

  public Greeting(long greetingCounter, String content){
    this.greetingCounter = greetingCounter;
    this.content = content;
  }
}

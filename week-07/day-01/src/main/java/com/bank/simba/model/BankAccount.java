package com.bank.simba.model;

public class BankAccount {
  private String name;
  private int balance;
  private String animalType;
  private boolean isKing;
  private boolean isGood;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean getIsKing() {
    return isKing;
  }

  public void setIsKing(boolean king) {
    isKing = king;
  }

  public boolean getIsGood() {
    return isGood;
  }

  public void setIsGood(boolean good) {
    isGood = good;
  }

  public BankAccount(){
  }

  public BankAccount(String name, int balance, String animalType, boolean isKing, boolean isGood){
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.isGood = isGood;
  }
}

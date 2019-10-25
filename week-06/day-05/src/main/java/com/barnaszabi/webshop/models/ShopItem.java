package com.barnaszabi.webshop.models;

public class ShopItem implements Comparable<ShopItem>{
  private String name;
  private String description;
  private double price;
  private int quantityOfStock;

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantityOfStock() {
    return quantityOfStock;
  }

  public ShopItem(String name, String description, double price, int quantityOfStock){
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
  }

  @Override
  public int compareTo(ShopItem that) {
    if (this.getPrice() < that.price){
      return -1;
    } else if (this.getPrice() == that.price){
      return 0;
    } else {
      return 1;
    }
  }
}

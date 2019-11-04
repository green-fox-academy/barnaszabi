package com.barnaszabi.foxclub.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Fox implements Serializable {
  private String name;
  private List<Trick> tricks = new ArrayList<>();
  private Food food = Food.bread;
  private Drink drink = Drink.water;

  public Fox(String name){
    this.name = name;
  }

  @Override
  public String toString() {
    return "This is Mr. " + name + ". Currently living on " + food + " and " + drink + ". he knows " + tricks.size() + " tricks";
  }
}

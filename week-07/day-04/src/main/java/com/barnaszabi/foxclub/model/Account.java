package com.barnaszabi.foxclub.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class Account implements Serializable {
  private String userName;
  private String password;
  private Fox fox;
  private int money = 100;

  public Account(String userName, String password, Fox fox) {
    this.userName = userName;
    this.password = password;
    this.fox = fox;
  }
}

package com.barnaszabi.foxclub.service;

import com.barnaszabi.foxclub.model.*;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoxClubService {
  List<Account> accounts = new ArrayList<>();

  public FoxClubService() {
    try {
      ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\Szabi\\Desktop\\greenfox\\barnaszabi\\week-07\\day-04\\src\\main\\java\\com\\barnaszabi\\foxclub\\model\\accounts.txt"));
      accounts = (List<Account>) in.readObject();
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  public boolean isAccountExists(String userName){
    if (accounts.size() > 0) {
      return accounts.stream().anyMatch(acc -> acc.getUserName().equals(userName));
    } else {
      return false;
    }
  }

  public Account getAccount(String userName){
    if (isAccountExists(userName)) {
      return accounts.stream()
          .filter(acc -> acc.getUserName().equals(userName))
          .collect(Collectors.toList()).get(0);
    } else {
      return null;
    }
  }

  public boolean isPasswordOK(String userName, String password){
    return getAccount(userName).getPassword().equals(password);
  }

  public boolean arePasswordsMatching(String password, String passwordVal){
    return password.equals(passwordVal);
  }

  public void addAccount(Account account){
    accounts.add(account);
    save();
  }

  public List<Trick> getTricks(String userName){
    return accounts.stream()
        .filter(acc -> acc.getUserName().equals(userName))
        .collect(Collectors.toList()).get(0)
        .getFox().getTricks();
  }

  public Account findAccount(String username){
    return accounts.stream()
        .filter(acc -> acc.getUserName().equals(username))
        .collect(Collectors.toList()).get(0);
  }

  private void save() {
    try {
      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Szabi\\Desktop\\greenfox\\barnaszabi\\week-07\\day-04\\src\\main\\java\\com\\barnaszabi\\foxclub\\model\\accounts.txt"));
      out.writeObject(accounts);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void setFood(String userName, Food food) {
    getAccount(userName).getFox().setFood(food);
    save();
  }

  public void setDrink(String userName, Drink drink) {
    getAccount(userName).getFox().setDrink(drink);
    save();
  }

  public boolean canLearn(String userName, Trick trick){
    return !getAccount(userName).getFox().getTricks().contains(trick);
  }

  public void addTrick(String userName, Trick trick){
    getAccount(userName).getFox().getTricks().add(trick);
    save();
  }
}

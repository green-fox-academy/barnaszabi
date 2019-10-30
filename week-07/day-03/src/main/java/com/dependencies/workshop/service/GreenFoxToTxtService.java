package com.dependencies.workshop.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("txt")
public class GreenFoxToTxtService implements GreenFoxServiceProvider, Serializable {
  private List<String> names;

  public GreenFoxToTxtService(){
    names = new ArrayList<>();
    try {
      ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\Szabi\\Desktop\\greenfox\\barnaszabi\\week-07\\day-03\\src\\main\\java\\com\\dependencies\\workshop\\names.txt"));
      names = (List<String>) in.readObject();
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  @Override
  public List<String> findAll() {
    return names;
  }

  @Override
  public void save(String student) {
    try {
      names.add(student);
      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Szabi\\Desktop\\greenfox\\barnaszabi\\week-07\\day-03\\src\\main\\java\\com\\dependencies\\workshop\\names.txt"));
      out.writeObject(names);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public int count() {
    return names.size();
  }

  @Override
  public boolean contains(String student) {
    return names.contains(student);
  }
}

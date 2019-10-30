package com.dependencies.workshop.service;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("list")
  public class GreenFoxToListService implements GreenFoxServiceProvider {
    ArrayList<String> names;

    public GreenFoxToListService() {
      names = new ArrayList<>();
      names.add("Sanyi");
      names.add("Lilla");
      names.add("John");
    }

    @Override
    public List<String> findAll() {
      return names;
    }

    @Override
    public void save(String student) {
      names.add(student);
    }

    @Override
    public int count(){
      return names.size();
    }

    @Override
    public boolean contains(String student){
      return names.contains(student);
    }
  }


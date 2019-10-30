package com.dependencies.workshop.service;

import java.util.List;

public interface GreenFoxServiceProvider {
  List<String> findAll();
  void save(String student);
  int count();
  boolean contains(String student);
}

package com.barnaszabi.todo.services;

import com.barnaszabi.todo.models.Todo;

import java.util.List;

public interface ITodoService {

  List<Todo> findAll();
  Todo findById(Long id);
  List<Todo> findAllByDone(boolean done);
  void save(Todo todo);
  void delete(Long id);
}

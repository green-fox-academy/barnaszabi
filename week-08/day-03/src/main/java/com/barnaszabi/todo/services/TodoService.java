package com.barnaszabi.todo.services;

import com.barnaszabi.todo.models.Todo;
import com.barnaszabi.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService implements ITodoService{
  @Autowired
  private TodoRepository repository;

  @Override
  public List<Todo> findAll() {
    List<Todo> todos = new ArrayList<>();
    repository.findAll().forEach(todos::add);
    return todos;
  }

  @Override
  public Todo findById(Long id){
    return repository.findById(id).orElse(null);
  }

  @Override
  public List<Todo> findAllByDone(boolean done) {
    return repository.findAllByDone(done);
  }

  @Override
  public void save(Todo todo) {
    repository.save(todo);
  }

  @Override
  public void delete(Long id){
    repository.deleteById(id);
  }
}

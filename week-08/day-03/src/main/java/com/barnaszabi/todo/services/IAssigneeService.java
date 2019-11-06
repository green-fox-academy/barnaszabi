package com.barnaszabi.todo.services;

import com.barnaszabi.todo.models.Assignee;

import java.util.List;

public interface IAssigneeService {
  List<Assignee> findAll();
  void save(Assignee assignee);
  void delete(Long id);
  Assignee findById(Long id);
}

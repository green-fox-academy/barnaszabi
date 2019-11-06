package com.barnaszabi.todo.services;

import com.barnaszabi.todo.models.Assignee;
import com.barnaszabi.todo.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssigneeService implements IAssigneeService{
  @Autowired
  private AssigneeRepository repository;

  @Override
  public List<Assignee> findAll() {
    List<Assignee> assignees = new ArrayList<>();
    repository.findAll().forEach(assignees::add);
    return assignees;
  }

  @Override
  public void save(Assignee assignee) {
    repository.save(assignee);
  }

  @Override
  public void delete(Long id) {
    repository.deleteById(id);
  }

  @Override
  public Assignee findById(Long id) {
    return repository.findById(id).orElse(null);
  }
}

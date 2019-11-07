package com.barnaszabi.todo.repositories;

import com.barnaszabi.todo.models.Assignee;
import com.barnaszabi.todo.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findAllByDone(boolean done);
  List<Todo> findAllByAssignee(Assignee assignee);
  List<Todo> findAllByTitleContainsIgnoreCase(String title);
  List<Todo> findAllByCreationContainsIgnoreCase(String date);
  List<Todo> findAllByDueDateContainsIgnoreCase(String date);
  List<Todo> findAllByAssigneeNameContainsIgnoreCase(String name);
}

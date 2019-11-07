package com.barnaszabi.todo.repositories;

import com.barnaszabi.todo.models.Assignee;
import org.springframework.data.repository.CrudRepository;

public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
}

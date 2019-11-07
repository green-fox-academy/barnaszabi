package com.barnaszabi.todo.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Assignee {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String email;
  @OneToMany(fetch = FetchType.EAGER, mappedBy = "assignee")
  private List<Todo> todos = new ArrayList<>();

  public void addTodo(Todo todo){
    todos.add(todo);
  }

  @Override
  public String toString() {
    return name;
  }
}

package com.barnaszabi.todo.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private boolean urgent;
  private boolean done;
  @ManyToOne(cascade = CascadeType.ALL)
  @Setter(AccessLevel.NONE)
  private Assignee assignee;
  @Transient
  private String assigneeId;

  public void setAssignee(Assignee assignee){
    assignee.addTodo(this);
    this.assignee = assignee;
  }
}

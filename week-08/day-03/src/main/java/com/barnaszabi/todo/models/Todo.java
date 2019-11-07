package com.barnaszabi.todo.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.event.spi.SaveOrUpdateEvent;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
  private String creation = formatDate();
  private String dueDate;
  @ManyToOne(cascade = CascadeType.MERGE)
  @Setter(AccessLevel.NONE)
  private Assignee assignee;
  @Transient
  private String assigneeId;

  public void setAssignee(Assignee assignee){
    assignee.addTodo(this);
    this.assignee = assignee;
  }

  private String formatDate(){
    String strDateFormat = "yyyy-MM-dd";
    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
    String formattedDate= dateFormat.format(new Date());
    return formattedDate;
  }
}

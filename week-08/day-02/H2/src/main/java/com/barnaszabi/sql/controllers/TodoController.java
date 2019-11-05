package com.barnaszabi.sql.controllers;

import com.barnaszabi.sql.models.Todo;
import com.barnaszabi.sql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {
  @Autowired
  private TodoRepository repository;

  @GetMapping(value = {"/", "/list"})
  public String list(Model model){
    List<Todo> todos = new ArrayList<>();
    repository.findAll().forEach(todos::add);
    model.addAttribute("list", todos);
    return "todolist";
  }
}

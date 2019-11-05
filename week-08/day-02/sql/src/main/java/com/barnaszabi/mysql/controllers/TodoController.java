package com.barnaszabi.mysql.controllers;

import com.barnaszabi.mysql.models.Todo;
import com.barnaszabi.mysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {
  @Autowired
  private TodoRepository repository;

  @GetMapping(value = {"/", "/list"})
  public String list(@RequestParam(required = false, name = "isActive") boolean isActive, Model model){
    List<Todo> todos = new ArrayList<>();
    if (isActive) {
      repository.findAllByDone(false).forEach(todos::add);
    } else {
      repository.findAll().forEach(todos::add);
    }
    model.addAttribute("list", todos);
    return "todolist";
  }
}

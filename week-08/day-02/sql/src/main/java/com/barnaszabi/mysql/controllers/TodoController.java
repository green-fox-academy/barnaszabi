package com.barnaszabi.mysql.controllers;

import com.barnaszabi.mysql.models.Todo;
import com.barnaszabi.mysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
      todos = repository.findAllByDone(false);
    } else {
      repository.findAll().forEach(todos::add);
    }
    model.addAttribute("list", todos);
    return "todolist";
  }

  @GetMapping(value = "/add")
  public String adding(@ModelAttribute(name = "todo") Todo todo){
    return "add";
  }

  @PostMapping(value = "/add")
  public String addNew(@ModelAttribute(name = "todo") Todo todo){
    repository.save(todo);
    return "redirect:/todo/list";
  }

  @GetMapping(value = "/delete/{id}")
  public String delete(@PathVariable(name = "id") Long id){
    repository.deleteById(id);
    return "redirect:/todo/list";
  }
}

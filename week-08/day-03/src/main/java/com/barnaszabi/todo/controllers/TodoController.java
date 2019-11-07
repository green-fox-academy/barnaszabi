package com.barnaszabi.todo.controllers;

import com.barnaszabi.todo.models.Todo;
import com.barnaszabi.todo.services.IAssigneeService;
import com.barnaszabi.todo.services.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {
  private ITodoService todoService;
  private IAssigneeService assigneeService;

  @Autowired
  public TodoController(ITodoService todoService, IAssigneeService assigneeService){
    this.todoService = todoService;
    this.assigneeService = assigneeService;
  }

   @GetMapping(value = {"/", "/list"})
  public String list(@RequestParam(required = false, name = "isActive") boolean isActive, Model model){
    List<Todo> todos = new ArrayList<>();
    if (isActive) {
      todos = todoService.findAllByDone(false);
    } else {
      todos = todoService.findAll();
    }
    model.addAttribute("list", todos);
    return "todoList";
  }

  @GetMapping(value = "/add")
  public String adding(@ModelAttribute(name = "todo") Todo todo){
    return "addTodo";
  }

  @PostMapping(value = "/add")
  public String addNew(@ModelAttribute(name = "todo") Todo todo){
    todoService.save(todo);
    return "redirect:/todo/list";
  }

  @GetMapping(value = "/delete/{id}")
  public String delete(@PathVariable(name = "id") Long id){
    todoService.delete(id);
    return "redirect:/todo/list";
  }

  @GetMapping(value = "/{id}/update")
  public String update(@PathVariable(name = "id") Long id, Model model){
    model.addAttribute("todo", todoService.findById(id));
    model.addAttribute("assignees", assigneeService.findAll());
    return "updateTodo";
  }

  @PostMapping(value = "/{id}/update")
  public String updateTodo(@ModelAttribute(name = "todo") Todo todo){
    if (todo.getAssigneeId() != null) {
    todo.setAssignee(assigneeService.findById(Long.parseLong(todo.getAssigneeId())));
    }
    todo.setCreation(todoService.findById(todo.getId()).getCreation());
    todoService.save(todo);
    return "redirect:/todo/list";
  }

  @PostMapping(value = "/search")
  public String search(Model model, @RequestParam(name = "searchByWhat") String searchByWhat ,@RequestParam(name = "search") String searched){
    List<Todo> found = todoService.search(searchByWhat, searched);
    model.addAttribute("list", found);
    return "todoList";
  }
}

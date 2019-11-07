package com.barnaszabi.todo.controllers;

import com.barnaszabi.todo.models.Assignee;
import com.barnaszabi.todo.services.IAssigneeService;
import com.barnaszabi.todo.services.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/assignee")
public class AssigneeController {
  IAssigneeService assigneeService;
  ITodoService todoService;

  @Autowired
  public AssigneeController(IAssigneeService assigneeService, ITodoService todoService){
    this.assigneeService = assigneeService;
    this.todoService = todoService;
  }

  @GetMapping(value = "/list")
  public String list(Model model){
    model.addAttribute("list", assigneeService.findAll());
    return "assigneeList";
  }

  @GetMapping(value = "/add")
  public String add(@ModelAttribute(name = "assignee")Assignee assignee){
    return "addAssignee";
  }

  @PostMapping(value = "/add")
  public String saveAssignee(@ModelAttribute(name = "assignee")Assignee assignee){
    assigneeService.save(assignee);
    return "redirect:/assignee/list";
  }

  @GetMapping(value = "/delete/{id}")
  public String delete(@PathVariable(name = "id") Long id){
    assigneeService.delete(id);
    return "redirect:/assignee/list";
  }

  @GetMapping(value = "/{id}/update")
  public String update(@ModelAttribute(name = "assignee") Assignee assignee, @PathVariable(name = "id") Long id){
    return "updateAssignee";
  }

  @PostMapping(value = "/{id}/update")
  public String updateTodo(@PathVariable(name = "id") Long id, @ModelAttribute(name = "assignee") Assignee assignee){
    assignee.setEmail(assigneeService.findById(id).getEmail());
    assigneeService.save(assignee);
    return "redirect:/assignee/list";
  }

  @GetMapping(value = "/{id}/todos")
  public String listTodos(@PathVariable(name = "id") Long id, Model model){
    model.addAttribute("list", todoService.findByAssignee(assigneeService.findById(id)));
    return "todoList";
  }
}

package com.dependencies.workshop.controller;

import com.dependencies.workshop.service.GreenFoxServiceProvider;
import com.dependencies.workshop.service.GreenFoxToListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreenFoxController {
  private GreenFoxServiceProvider service;

  @Autowired
  public GreenFoxController(@Qualifier("txt") GreenFoxServiceProvider service){
    this.service = service;
  }

  @GetMapping(value = "/gfa")
  public String mainPage(Model model){
    model.addAttribute("count", service.count());
    return "greenFoxMain";
  }

  @GetMapping(value = "/gfa/list")
  public String listStudent(Model model){
    model.addAttribute("list", service.findAll());
    return "listing";
  }

  @GetMapping(value = "/gfa/add")
  public String addStudent(){
    return "addName";
  }

  @PostMapping(value = "/gfa/save")
  public String saveStudent(@RequestParam String name){
    service.save(name);
    return "redirect:/gfa";
  }

  @GetMapping(value = "/gfa/check")
  public String check(@RequestParam(required = false) String name, Model model){
    if (service.contains(name)){
      model.addAttribute("givenName", name);
    } else {
      model.addAttribute("nameNotInList", name);
    }
    return "check";
  }
}

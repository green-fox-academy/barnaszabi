package com.barnaszabi.reddit.controllers;

import com.barnaszabi.reddit.models.User;
import com.barnaszabi.reddit.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
  @Autowired
  IUserService service;

  @GetMapping(value = "/register")
  public String registration(){
    return "register";
  }

  @PostMapping(value = "/register")
  public String saveNew(@RequestParam(name = "username")String username, @RequestParam(name = "password")String password, @RequestParam(name = "passwordVal")String passwordVal){
    if (service.isRegistrationValid(username, password, passwordVal)) {
      service.save(new User(username, password));
      return "redirect:/login";
    } else {
      return "redirect:/register";
    }
  }
}

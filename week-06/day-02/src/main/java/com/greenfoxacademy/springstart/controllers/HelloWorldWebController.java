package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldWebController {
  @RequestMapping(value = "/web/helloka")
  public String helloInLotOfLanguages(@RequestParam String color, @RequestParam String size, Model model){
    model.addAttribute("color", "color: " + color);
    model.addAttribute("size", "font-size: " + size);
    return "greeting2";
  }
}

package com.dependencies.workshop.controller;

import com.dependencies.workshop.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulController {
  private UtilityService service;

  @Autowired
  public UsefulController(UtilityService service){
    this.service = service;
  }

  @GetMapping(value = "/useful")
  public String mainPage(){
    return "main";
  }

  @GetMapping(value = "/useful/colored")
  public String coloredPage(Model model){
    model.addAttribute("color",service.randomColor());
    return "coloredPage";
  }

  @GetMapping(value = "useful/email")
  public String emailValidation(@RequestParam String email, Model model){
    if (service.validateEmail(email)) {
      model.addAttribute("color", "color: green");
    } else {
      model.addAttribute("color", "color: red");
    }
    model.addAttribute("email", email);
    return "email";
  }

  @GetMapping(value = "useful/encode")
  public String encode(@RequestParam String text,@RequestParam int number, Model model){
    model.addAttribute("coded", service.caesar(text, number));
    return "text";
  }

  @GetMapping(value = "useful/decode")
  public String decode(@RequestParam String text,@RequestParam int number, Model model){
    model.addAttribute("coded", service.caesar(text, -number));
    return "text";
  }
}

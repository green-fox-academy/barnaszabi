package com.barnaszabi.foxclub.controller;

import com.barnaszabi.foxclub.model.*;
import com.barnaszabi.foxclub.service.FoxClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  private FoxClubService service;
  int test = 0;

  @Autowired
  public MainController(FoxClubService service) {
    this.service = service;
  }

  @GetMapping(value = "/")
  public String showMainPage(@RequestParam(name = "userName", required = false) String userName, Model model) {
    if (userName != null) {
      model.addAttribute("userName", userName);
      model.addAttribute("text", service.getAccount(userName).getFox());
      model.addAttribute("tricks", service.getTricks(userName));
      model.addAttribute("money", service.getAccount(userName).getMoney());
      return "information";
    } else {
      return "redirect:/login";
    }
  }

  @GetMapping(value = "/login")
  public String loginGet(){
   return "login";
  }

  @PostMapping(value = "/login")
  public String loginPost(@RequestParam(name = "userName") String userName, @RequestParam(name = "password") String password, Model model){
    if (!service.isAccountExists(userName)){
      model.addAttribute("error", "This user doesn't exist");
      return "login";
    } else {
      if (!service.isPasswordOK(userName, password)){
        model.addAttribute("error", "Wrong password");
        return "login";
      }
      return "redirect:/?userName=" + userName;
    }
  }

  @GetMapping(value = "/registration")
  public String registrationGet(){
    return "registration";
  }

  @PostMapping(value = "/registration")
  public String registrationPost(@RequestParam(name = "userName") String userName,@RequestParam(name = "foxName") String foxName, @RequestParam(name = "password") String password, @RequestParam(name = "passwordVal") String passwordVal, Model model){
    if (!service.isAccountExists(userName)){
      if (service.arePasswordsMatching(password, passwordVal)) {
        service.addAccount(new Account(userName, password, new Fox(foxName)));
        return "redirect:/login";
      } else {
        model.addAttribute("error", "Passwords are not similar");
        return "registration";
      }
    } else {
      model.addAttribute("error", "Username already taken");
      return "registration";
    }
  }

  @GetMapping(value = "/foodstore")
  public String getFoods(@RequestParam(name = "userName") String userName, Model model){
    model.addAttribute("foods", Food.values());
    model.addAttribute("userName", userName);
    return "foods";
  }

  @PostMapping(value = "/foodstore")
  public String postFoods(@RequestParam(name = "foods") Food food, @RequestParam(name = "userName") String userName, Model model){
    model.addAttribute("userName", userName);
    service.setFood(userName, food);
    return "redirect:/?userName=" + userName;
  }

  @GetMapping(value = "/drinkstore")
  public String getDrinks(@RequestParam(name = "userName") String userName, Model model){
    model.addAttribute("drinks", Drink.values());
    model.addAttribute("userName", userName);
    return "drinks";
  }

  @PostMapping(value = "/drinkstore")
  public String postDrinks(@RequestParam(name = "drinks") Drink drink, @RequestParam(name = "userName") String userName, Model model){
    model.addAttribute("userName", userName);
    service.setDrink(userName, drink);
    return "redirect:/?userName=" + userName;
  }

  @GetMapping(value = "/learning")
  public String getTricks(@RequestParam(name = "userName") String userName, Model model){
    model.addAttribute("userName", userName);
    model.addAttribute("tricks", Trick.values());
    return "tricks";
  }

  @PostMapping(value = "/learning")
  public String adTricks(@RequestParam(name = "userName") String userName, @RequestParam(name = "trick") Trick trick, Model model) {
    model.addAttribute("username", userName);
    if (service.canLearn(userName, trick)){
      service.addTrick(userName, trick);
      return "redirect:/?userName=" + userName;
    } else {
      model.addAttribute("userName", userName);
      model.addAttribute("error", "Your fox already knows this!");
      model.addAttribute("tricks", Trick.values());
      return "tricks";
    }
  }

  @GetMapping(value = "/logout")
  public String logout(){
    return "redirect:/";
  }
}

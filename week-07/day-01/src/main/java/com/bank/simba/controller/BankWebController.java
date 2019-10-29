package com.bank.simba.controller;

import com.bank.simba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BankWebController {

  List<BankAccount> accounts;
  public BankWebController(){
    accounts = new ArrayList<>();
    accounts.add(new BankAccount("Simba", 2000, "Lion", true, true));
    accounts.add(new BankAccount("Timon", 250, "Meerkat", false, true));
    accounts.add(new BankAccount("Pumbaa", 120, "Warthog", false, true));
    accounts.add(new BankAccount("Rafiki", 1260, "Mandrill", false, true));
    accounts.add(new BankAccount("Zazu", 1400, "Hornbill", false, true));
  }

  @GetMapping(value = "/show")
  public String show(Model model) {
    BankAccount simba = new BankAccount("Simba", 2000, "Lion", true, true);
    model.addAttribute("account", simba);
    return "index";
  }

  @GetMapping(value = "HTMLception")
  public String HTMLception(Model model){
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    model.addAttribute("text2", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "index2";
  }

  @GetMapping(value = "/list")
  public String listingAccounts (@ModelAttribute(name = "accountToAdd") BankAccount accountToAdd, Model model){
    model.addAttribute("listOfAnimals", accounts);
    model.addAttribute("accountToAdd", accountToAdd);
    return "listing";
  }

  @PostMapping(value = "/raise")
  public String raiseBalance(@ModelAttribute(name = "name") String name){
    BankAccount getsRaised = accounts.stream().filter(c -> c.getName().equals(name)).collect(Collectors.toList()).get(0);
    if (getsRaised.getIsKing()){
      getsRaised.setBalance(getsRaised.getBalance() + 100);
    } else {
      getsRaised.setBalance(getsRaised.getBalance() + 10);
    }
    return "redirect:/list";
  }

  @PostMapping(value = "/add")
  public String add(@ModelAttribute(name = "accountToAdd") BankAccount accountToAdd){
    accounts.add(accountToAdd);
    return "redirect:/list";
  }
}

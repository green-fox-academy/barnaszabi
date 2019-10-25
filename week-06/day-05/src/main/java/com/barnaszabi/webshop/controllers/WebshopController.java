package com.barnaszabi.webshop.controllers;

import com.barnaszabi.webshop.models.ShopItem;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

@Controller
public class WebshopController {
  private List<ShopItem> shopItemList = new ArrayList<>();

  public WebshopController(){
    fillList();
  }

  public void fillList(){
    shopItemList.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000.0, 5));
    shopItemList.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2));
    shopItemList.add(new ShopItem("Coca cola", "0.5l standard coke", 25.0, 0));
    shopItemList.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0, 100));
    shopItemList.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300.0, 1));
  }

  @GetMapping(value = "/webshop")
  public String present(Model model){
    model.addAttribute("shopList" ,shopItemList);
    model.addAttribute("currency", "Kč");
    return "webshopWithTable";
  }
  
  @GetMapping(value = "/only-available")
  public String onlyAvailable(Model model){
    List<ShopItem> onlyAvailableItems = shopItemList.stream()
        .filter(x -> x.getQuantityOfStock() > 0)
        .collect(Collectors.toList());
    model.addAttribute("shopList", onlyAvailableItems);
    model.addAttribute("currency", "Kč");
    return "webshopWithTable";
  }

  @GetMapping(value = "/cheapest-first")
  public String cheapestFirst(Model model){
    List<ShopItem> cheapestFirst = shopItemList.stream()
        .sorted().collect(Collectors.toList());
    model.addAttribute("shopList" , cheapestFirst);
    model.addAttribute("currency", "Kč");
    return "webshopWithTable";
  }

  @GetMapping(value = "/contains-nike")
  public String containsNike(Model model){
    List<ShopItem> containsNike = shopItemList.stream()
        .filter(x -> x.getName().toLowerCase().contains("nike") || x.getDescription().toLowerCase().contains("nike"))
        .collect(Collectors.toList());
    model.addAttribute("shopList" , containsNike);
    model.addAttribute("currency", "Kč");
    return "webshopWithTable";
  }

  @GetMapping(value = "/average-stock")
  public String avgStock(Model model){
    int sum = shopItemList.stream()
        .mapToInt(ShopItem::getQuantityOfStock).sum();
    double avg = (double)sum/shopItemList.size();
    model.addAttribute("text", "Average stock: " + avg);
    return "webshopWithText";
  }

  @GetMapping(value = "/most-expensive")
  public String mostExpensive(Model model){
    double max = shopItemList.stream()
        .filter(c -> c.getQuantityOfStock() > 0)
        .mapToDouble(ShopItem::getPrice)
        .max().getAsDouble();
    List<ShopItem> mostExp = shopItemList.stream().filter(c -> c.getPrice() == max).collect(Collectors.toList());
    model.addAttribute("text", "The most expensive item: " + mostExp.get(0).getName());
    return "webshopWithText";
  }

  @PostMapping(value = "/search")
  public String search(Model model, @RequestParam String searched){
    List<ShopItem> searchedItems = shopItemList.stream()
        .filter(x -> x.getName().toLowerCase().contains(searched) || x.getDescription().toLowerCase().contains(searched))
        .collect(Collectors.toList());
    model.addAttribute("shopList", searchedItems);
    return "webshopWithTable";
  }
}

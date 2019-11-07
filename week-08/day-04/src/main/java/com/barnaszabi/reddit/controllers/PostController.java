package com.barnaszabi.reddit.controllers;

import com.barnaszabi.reddit.models.Post;
import com.barnaszabi.reddit.services.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;

@Controller
public class PostController {
  private IPostService service;

  @Autowired
  public PostController(IPostService service){
    this.service = service;
  }

  @GetMapping(value = {"", "/{page}"})
  public String listPosts(@PathVariable(name = "page", required = false) Integer page, Model model){
    if (page == null){
      page = 1;
    }
    model.addAttribute("posts", service.listAll(page));
    model.addAttribute("page", page);
    return "main";
  }

  @GetMapping(value = "/add")
  public String addNew(@ModelAttribute(name = "newPost") Post newPost){
    return "add";
  }

  @PostMapping(value = "/add")
  public String saveNew(@ModelAttribute(name = "newPost") Post newPost){
    service.save(newPost);
    return "redirect:/";
  }

  @GetMapping(value = "/{id}/upvote")
  public String upVote(@PathVariable(name = "id") Long id){
    service.upVote(id);
    return "redirect:/";
  }

  @GetMapping(value = "/{id}/downvote")
  public String downVote(@PathVariable(name = "id") Long id){
    service.downVote(id);
    return "redirect:/";
  }
}

package com.barnaszabi.reddit.services;

import com.barnaszabi.reddit.models.Post;
import com.barnaszabi.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService implements IPostService{
  @Autowired
  PostRepository repo;

  @Override
  public List<Post> listAll(Integer page) {
    List<Post> posts = new ArrayList<>();
    repo.findAllOrderByPoints(10*(page-1),10*page).forEach(posts::add);
    return posts;
  }

  @Override
  public void save(Post post) {
    repo.save(post);
  }

  @Override
  public void upVote(Long id) {
    Post toEdit = repo.findById(id).orElse(null);
    toEdit.setPoints(toEdit.getPoints() + 1);
    repo.save(toEdit);
  }

  @Override
  public void downVote(Long id) {
    Post toEdit = repo.findById(id).orElse(null);
    toEdit.setPoints(toEdit.getPoints() - 1);
    repo.save(toEdit);
  }
}

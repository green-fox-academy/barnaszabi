package com.barnaszabi.reddit.services;

import com.barnaszabi.reddit.models.Post;

import java.util.List;

public interface IPostService {
  List<Post> listAll(Integer page);
  void save(Post post);
  void upVote(Long id);
  void downVote(Long id);
}

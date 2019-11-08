package com.barnaszabi.reddit.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String username;
  private String password;
  private boolean enabled = true;
  private String authority = "USER";
  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "creator")
  private List<Post> posts = new ArrayList<>();

  public User(String username, String password){
    this.username = username;
    this.password = password;
  }

  public void addPost(Post post){
    post.setCreator(this);
    posts.add(post);
  }
}

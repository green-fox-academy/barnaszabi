package com.barnaszabi.reddit.services;

import com.barnaszabi.reddit.models.User;
import com.barnaszabi.reddit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{
  @Autowired
  UserRepository repo;

  @Override
  public void save(User user) {
    repo.save(user);
  }

  @Override
  public boolean isRegistrationValid(String username, String password, String passwordVal){
    if (!repo.existsByUsername(username)){
      return password.equals(passwordVal);
    } else {
      return false;
    }
  }
}

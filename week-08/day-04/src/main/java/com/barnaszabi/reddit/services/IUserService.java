package com.barnaszabi.reddit.services;

import com.barnaszabi.reddit.models.User;

public interface IUserService {
  void save(User user);
  public boolean isRegistrationValid(String username, String password, String passwordVal);
}

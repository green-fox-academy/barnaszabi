package com.barnaszabi.reddit.repositories;

import com.barnaszabi.reddit.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
  boolean existsByUsername(String username);
}

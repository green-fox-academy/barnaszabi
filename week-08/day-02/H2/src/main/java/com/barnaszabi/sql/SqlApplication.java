package com.barnaszabi.sql;

import com.barnaszabi.sql.models.Todo;
import com.barnaszabi.sql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqlApplication implements CommandLineRunner {
  @Autowired
  private TodoRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(SqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    repository.save(new Todo("Start the day"));
    repository.save(new Todo("Finish H2 workshop1"));
    repository.save(new Todo("Finish JPA workshop2"));
    repository.save(new Todo("Create a CRUD project"));
    repository.save(new Todo("I have to learn Object Relational Mapping"));
  }
}

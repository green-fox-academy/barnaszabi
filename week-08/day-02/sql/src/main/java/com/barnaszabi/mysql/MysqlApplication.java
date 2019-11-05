package com.barnaszabi.mysql;

import com.barnaszabi.mysql.models.Todo;
import com.barnaszabi.mysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlApplication{

  public static void main(String[] args) {
    SpringApplication.run(MysqlApplication.class, args);
  }

}

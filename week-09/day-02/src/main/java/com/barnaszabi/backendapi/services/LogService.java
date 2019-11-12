package com.barnaszabi.backendapi.services;

import com.barnaszabi.backendapi.models.Log;
import com.barnaszabi.backendapi.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LogService  implements ILogService{
  @Autowired
  LogRepository repo;

  @Override
  public List<Log> listAll() {
    List<Log> logs = new ArrayList<>();
    repo.findAll().forEach(logs::add);
    return logs;
  }

  @Override
  public void save(Log log) {
    repo.save(log);
  }
}

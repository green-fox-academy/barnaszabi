package com.barnaszabi.backendapi.services;

import com.barnaszabi.backendapi.models.Log;

import java.util.List;

public interface ILogService {
  List<Log> listAll();
  void save(Log log);
}

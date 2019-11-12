package com.barnaszabi.backendapi.repositories;

import com.barnaszabi.backendapi.models.Log;
import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository<Log, Long> {
}

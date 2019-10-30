package com.dependencies.workshop.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("red")
public interface MyColor {
  void printColor();
}

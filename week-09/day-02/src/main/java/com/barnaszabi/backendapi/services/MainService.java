package com.barnaszabi.backendapi.services;

import org.springframework.stereotype.Service;

@Service
public class MainService {
  public int factor(int number){
    int out = 1;
    for (int i = 1; i < number + 1; i++) {
      out *= i;
    }
    return out;
  }

  public int sum(int number){
    int out = 0;
    for (int i = 0; i < number + 1; i++) {
      out += i;
    }
    return out;
  }

  public int sumWithArray(int[] numbers){
    int out = 0;
    for (int i = 0; i < numbers.length; i++) {
      out += numbers[i];
    }
    return out;
  }

  public int multiply(int[] numbers){
    int out = 1;
    for (int i = 0; i < numbers.length; i++) {
      out *= numbers[i];
    }
    return out;
  }

  public void doubleArray(int[] numbers){
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = numbers[i] * 2;
    }
  }
}

package com.dependencies.workshop.model;

import com.dependencies.workshop.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("green")
public class Green implements MyColor {
  private Printer printer;

  @Autowired
  public Green (Printer printer){
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("It is green in color...");
  }
}

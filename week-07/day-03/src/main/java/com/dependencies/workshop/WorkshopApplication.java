package com.dependencies.workshop;

import com.dependencies.workshop.model.MyColor;
import com.dependencies.workshop.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkshopApplication implements CommandLineRunner {
  private Printer printer;
  private MyColor myColor;

  @Autowired
  WorkshopApplication(Printer printer, @Qualifier("yellow")MyColor myColor){
    this.myColor = myColor;
    this.printer = printer;
  }

  public static void main(String[] args) {
    SpringApplication.run(WorkshopApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    myColor.printColor();
    printer.log("Hello");
  }
}

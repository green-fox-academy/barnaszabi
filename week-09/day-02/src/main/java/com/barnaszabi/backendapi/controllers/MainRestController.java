package com.barnaszabi.backendapi.controllers;

import com.barnaszabi.backendapi.models.*;
import com.barnaszabi.backendapi.models.Error;
import com.barnaszabi.backendapi.services.ILogService;
import com.barnaszabi.backendapi.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;

@RestController
public class MainRestController {
  @Autowired
  MainService mainService;
  @Autowired
  ILogService logService;

  @GetMapping(value = "/doubling")
  public ResponseEntity<?> doubling(@RequestParam(name = "input", required = false) Integer number){
    logService.save(new Log(new Date(), "/doubling", "input="+number));
    if (number != null){
    return ResponseEntity.status(HttpStatus.OK).body(new Doubling(number, number*2));
  } else {
      return ResponseEntity.status(HttpStatus.OK).body(new Error("Please provide an input!"));
    }
  }

  @GetMapping(value = "/greeter")
  public ResponseEntity<?> greet(@RequestParam(name = "name", required = false) String name, @RequestParam(name = "title", required = false) String title){
    logService.save(new Log(new Date(), "/greeter", "name=" + name + ", title=" + title));
    if (name != null && title != null){
      return ResponseEntity.status(HttpStatus.OK).body(new Greeting("Oh, hi there " + name + ", my dear " + title + "!"));
    } else if (name == null){
      if (title == null){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Error("Please provide a name and a title!"));
      } else {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Error("Please provide a name!"));
      }
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Error("Please provide a title!"));
    }
  }

  @GetMapping(value = "/appenda/{appendable}")
  public ResponseEntity<?> append(@PathVariable(name = "appendable") String appendable){
    logService.save(new Log(new Date(), "/appenda/{appendable}", "appendable=" + appendable));
    if (appendable != null){
      return ResponseEntity.status(HttpStatus.OK).body(new Append(appendable + 'a'));
    } else {
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping(value = "/dountil/{action}")
  public ResponseEntity<?> doUntil(@PathVariable(name = "action") String action, @RequestBody DoUntilInput number){
    logService.save(new Log(new Date(), "/dountil/{action}", "action=" + action + ", until=" + number.getUntil()));
    if (action.equals("factor")){
      return ResponseEntity.status(HttpStatus.OK).body(new DoUntil(mainService.factor(number.getUntil())));
    } else if (action.equals("sum")){
      return ResponseEntity.status(HttpStatus.OK).body(new DoUntil(mainService.sum(number.getUntil())));
    } else {
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping(value = "/arrays")
  public ResponseEntity<?> arrays(@RequestBody ArraysInput input){
    logService.save(new Log(new Date(), "/arrays", "what=" + input.getWhat() + ", numbers=" + Arrays.toString(input.getNumbers())));
    if (input.getWhat() == null || input.getNumbers() == null){
      return ResponseEntity.status(HttpStatus.OK).body("Please provide what to do with the numbers!");
    } else {
      if (input.getWhat().equals("sum")){
        return ResponseEntity.status(HttpStatus.OK).body(new ArraysOutWithInt(mainService.sumWithArray(input.getNumbers())));
      } else if (input.getWhat().equals("multiply")){
        return ResponseEntity.status(HttpStatus.OK).body(new ArraysOutWithInt(mainService.multiply(input.getNumbers())));
      } else if (input.getWhat().equals("double")){
        mainService.doubleArray(input.getNumbers());
        return ResponseEntity.status(HttpStatus.OK).body(new ArrasOutWithArray(input.getNumbers()));
      } else {
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
      }
    }
  }

  @GetMapping(value = "/logs")
  public ResponseEntity<LogOutput> listLogs(){
    return ResponseEntity.status(HttpStatus.OK).body(new LogOutput(logService.listAll(), logService.listAll().size()));
  }
}

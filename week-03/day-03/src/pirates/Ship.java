package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  List<Pirate> crew;
  Pirate captain;
  static Random random;

  public int countingPirates(){
    int count = 0;
    for (int i = 0; i < this.crew.size(); i++) {
      if (this.crew.get(i).alive){
        count++;
      }
    }
    return count;
  }

  public int calculatingScore(){
    return (this.countingPirates() - this.captain.counter);
  }

  public void fillShip(){
    this.crew = new ArrayList<>();
    this.random = new Random();
    int size = (20 + this.random.nextInt(20));
    for (int i = 1; i < size; i++) {
      this.crew.add(new Pirate());
    }
    this.captain = new Pirate();
  }

  public void represent(){
    String text = "";
    if (!this.captain.alive){
      text = "and he is dead";
    }else if (this.captain.passedOut){
      text = "and he is passed out";
    }else {
      text = " and he is alive and awake";
    }
    System.out.println("The captain consumed " + this.captain.counter + ", " + text);
    System.out.println("The size of the crew is " + this.crew.size());
  }

  public boolean battle(Ship otherShip){
    if (this.calculatingScore() > otherShip.calculatingScore()){
      this.drinking();
      otherShip.dying();
      return true;
    }else{
      this.dying();
      otherShip.drinking();
      return false;
    }
  }

  public void drinking(){
    this.random = new Random();
    int drinks = this.random.nextInt(6);
    for (int i = 0; i < drinks; i++) {
      this.captain.drinkSomeRum();
      for (int j = 0; j < this.crew.size(); j++) {
        this.crew.get(i).drinkSomeRum();
      }
    }
  }

  public void dying(){
    this.random = new Random();
    int deaths = this.random.nextInt(this.crew.size());
    int deathIndex = this.random.nextInt(this.crew.size());
    for (int i = 0; i < deaths; i++) {
      while (!this.crew.get(deathIndex).alive){
        deathIndex = this.random.nextInt(this.crew.size());
      }
      this.crew.get(deathIndex).die();
    }
  }

}

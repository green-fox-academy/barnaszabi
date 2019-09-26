package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  /*reate a Ship class.
  The Ship stores Pirate-s instances in a list as the crew and has one captain who is also a Pirate.
  When a ship is created it doesn't have a crew or a captain.*/

  List<Pirate> crew;
  Pirate captain;
  static Random random;

  public int countingPirates() {
    int count = 0;
    for (int i = 0; i < this.crew.size(); i++) {
      if (this.crew.get(i).alive) {
        count++;
      }
    }
    return count;
  }

  public int calculatingScore() {
    return (this.countingPirates() - this.captain.counter);
  }

  public void fillShip() {
    /*he ship can be filled with pirates and a captain via fillShip() method.
        Filling the ship with a captain and random number of pirates.*/
    this.crew = new ArrayList<>();
    this.random = new Random();
    int size = (20 + this.random.nextInt(20));
    for (int i = 1; i < size; i++) {
      this.crew.add(new Pirate());
    }
    this.captain = new Pirate();
  }

  public void represent() {
    /*Ships should be represented in a nice way on command line including information about
    captains consumed rum, state (passed out / died)
    number of alive pirates in the crew*/
    String text = "";
    if (!this.captain.alive) {
      text = "and he is dead";
    } else if (this.captain.passedOut) {
      text = "and he is passed out";
    } else {
      text = " and he is alive and awake";
    }
    System.out.println("The captain consumed " + this.captain.counter + ", " + text);
    System.out.println("The size of the crew is " + this.crew.size());
  }

  public boolean battle(Ship otherShip) {
    /*Ships should have a method to battle other ships: ship.battle(otherShip)
    should return true if the actual ship (this) wins
    the ship should win if its calculated score is higher
    calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
    The loser crew has a random number of losses (deaths).
        The winner captain and crew has a party, including a random number of rum :)*/
    if (this.calculatingScore() > otherShip.calculatingScore()) {
      this.drinking();
      otherShip.dying();
      return true;
    } else {
      this.dying();
      otherShip.drinking();
      return false;
    }
  }

  public void drinking() {
    this.random = new Random();
    int drinks = this.random.nextInt(6);
    for (int i = 0; i < drinks; i++) {
      this.captain.drinkSomeRum();
      for (int j = 0; j < this.crew.size(); j++) {
        this.crew.get(i).drinkSomeRum();
      }
    }
  }

  public void dying() {
    this.random = new Random();
    int deaths = this.random.nextInt(this.crew.size());
    int deathIndex = this.random.nextInt(this.crew.size());
    for (int i = 0; i < deaths; i++) {
      while (!this.crew.get(deathIndex).alive) {
        deathIndex = this.random.nextInt(this.crew.size());
      }
      this.crew.get(deathIndex).die();
    }
  }

}

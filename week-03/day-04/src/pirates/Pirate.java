package pirates;

import java.util.Random;

public class Pirate {

  //Create a Pirate class. While you can add other fields and methods, you must have these methods:-

  int counter = 0;
  boolean alive = true;
  boolean passedOut = false;

  public void drinkSomeRum(){
    //drinkSomeRum() - intoxicates the Pirate some
    if (this.alive){
      this.counter++;
    }else{
      System.out.println("he's dead");
    }
  }

  public void howsItGoingMate(){
    /*howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
        0 to 4 times, "Pour me anudder!"
      else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.*/
    if (this.alive){
      if (this.counter < 4){
        System.out.println("Pour me anudder!");
      }else{
        passOut();
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      }
    }else{
      System.out.println("he's dead");
    }
  }

  public void passOut(){
    this.counter = 0;
    this.passedOut = true;
  }

  public void die(){
    //die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
    alive = false;
  }

  public void brawl(Pirate otherPirate){
    //brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance, 1 dies, the other dies or they both pass out.
    if ((this.alive) && (otherPirate.alive)){
      Random random = new Random();
      int rand = random.nextInt(101);
      if (rand <= 33){
        this.die();
      }else if ((rand > 33) && (rand <= 66)){
        otherPirate.die();
      }else{
        this.passOut();
        otherPirate.passOut();
      }
    }
  }
}

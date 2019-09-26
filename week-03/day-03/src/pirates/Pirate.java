package pirates;

import java.util.Random;

public class Pirate {

  int counter = 0;
  boolean alive = true;
  boolean passedOut = false;

  public void drinkSomeRum(){
    if (this.alive){
      this.counter++;
    }else{
      System.out.println("he's dead");
    }
  }

  public void passOut(){
    System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
    this.counter = 0;
    this.passedOut = true;
  }
  public void howsItGoingMate(){
    if (this.alive){
      if (this.counter < 4){
        System.out.println("Pour me anudder!");
      }else{
        passOut();
      }
    }else{
      System.out.println("he's dead");
    }
  }

  public void die(){
    alive = false;
  }

  public void brawl(Pirate otherPirate){
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

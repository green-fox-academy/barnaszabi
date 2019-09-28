package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Armada {
  /*Create an Armada class
  Contains Ship-s as a list*/
  List<Ship> ships = new ArrayList<>();

  public void fill(){
    Random random= new Random();
    int size = (10 + random.nextInt(50));
    for (int i = 0; i < size; i++) {
      ships.add(new Ship());
      ships.get(i).fillShip();
    }
  }

  public boolean war (Armada otherArmada){
    /*Have a armada.war(otherArmada) method where two armada can engage in war
    it should work like merge sort
    first ship from the first armada battles the first of the other
    the loser gets skipped so the next ship comes in play from that armada
    whichever armada gets to the end of its ships loses the war
    return true if this is the winner*/
    int thisLoss = 0;
    int otherLoss = 0;
    while ((thisLoss < this.ships.size()) && (otherLoss < otherArmada.ships.size())){
      if (this.ships.get(thisLoss).battle(otherArmada.ships.get(otherLoss))){
        otherLoss++;
      }else{
        thisLoss++;
      }
    }
    return (thisLoss < this.ships.size());
  }
}

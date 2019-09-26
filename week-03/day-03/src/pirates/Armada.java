package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Armada {
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

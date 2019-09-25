package farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
  List<Animal> animals = new ArrayList<>();
  int slots = 10;

  public void breed(){
    if (this.slots > 0){
      animals.add(new Animal());
    }
  }

  public void slaughter(){
    int min = 0;
    for (int i = 1; i < animals.size(); i++) {
      if (animals.get(i).hunger < animals.get(min).hunger){
        min = i;
      }
    }
    animals.remove(min);
  }
}

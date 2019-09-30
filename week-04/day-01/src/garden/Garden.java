package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  public List<Plant> plants;

  public Garden(){
    plants = new ArrayList<>();
  }

  public  void addPlant(Plant plant){
    plants.add(plant);
  }

  public int countNeedWater(){
    int counter = 0;
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).getNeedsWater()){
        counter++;
      }
    }
    return counter;
  }

  public void watering(double amountOfWater){
    System.out.println("\nWatering with " + amountOfWater);
    int amountOfPlants = countNeedWater();
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).getNeedsWater()){
        plants.get(i).watering(amountOfWater / amountOfPlants);
        plants.get(i).isNeedWater();
      }
    }
  }
}


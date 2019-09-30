package garden;

public class Flower extends Plant{
  public Flower(double currentWater, String color){
    super(currentWater < 5, currentWater, color);
  }

  public void watering(double amountOfWater){
    setCurrentWater(amountOfWater * 0.75);
  }

  public void isNeedWater(){
    setNeedsWater(getCurrentWater() < 5);
  }

  @Override
  public String toString() {
    String textPart = "";
    if (getNeedsWater()){
      textPart = " needs ";
    }else{
      textPart = " doesn't need " ;
    }
    return ("The " + getColor() + " Flower" + textPart + "water");
  }
}

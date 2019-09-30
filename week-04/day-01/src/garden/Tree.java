package garden;

public class Tree extends Plant{
  public Tree(double currentWater, String color){
    super(currentWater < 10, currentWater, color);
  }

  public void watering(double waterAmount){
    setCurrentWater(waterAmount*0.4);
  }

  public void isNeedWater(){
    setNeedsWater(getCurrentWater() < 10);
  }

  @Override
  public String toString() {
    String textPart = "";
    if (getNeedsWater()){
      textPart = " needs ";
    }else{
      textPart = " doesn't need ";
    }
    return ("The " + getColor() + " Flower" + textPart + "water");
  }
}

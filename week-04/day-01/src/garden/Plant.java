package garden;

public class Plant {
  private boolean needsWater;
  private double currentWater;
  private String color;

  public boolean getNeedsWater() {
    return needsWater;
  }

  public void setNeedsWater(boolean needsWater) {
    this.needsWater = needsWater;
  }

  public double getCurrentWater() {
    return currentWater;
  }

  public void setCurrentWater(double currentWater) {
    this.currentWater += currentWater;
  }

  public String getColor(){
    return color;
  }

  public Plant(boolean needsWater, double currentWater, String color){
    this.needsWater = needsWater;
    this.currentWater = currentWater;
    this.color = color;
  }

  public void watering(double amountOfWater){
  }

  public void isNeedWater(){
  }
}

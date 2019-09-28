package petrolstation;

public class Station {
  int gasAmount;
  public void refill(Car car){
    gasAmount -= car.capacity;
    car.gasAmount += car.capacity;
  }
}

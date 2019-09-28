package pirates;

public class BattleApp {
  public static void main(String[] args) {

    /*Create a BattleApp class with a main method
        Create 2 ships, fill them with pirates
    Have a battle!*/
    Ship first = new Ship();
    Ship second  = new Ship();
    first.fillShip();
    second.fillShip();
    //first.represent();
    //System.out.println(first.countingPirates());
    //second.represent();
    //System.out.println(second.countingPirates());
    first.battle(second);
    //first.represent();
    //System.out.println(first.countingPirates());
    //second.represent();
    //System.out.println(second.countingPirates());
  }
}

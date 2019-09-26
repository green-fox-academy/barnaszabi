package pirates;

public class BattleApp {
  public static void main(String[] args) {
    Ship first = new Ship();
    Ship second  = new Ship();

    first.fillShip();

    second.fillShip();

    first.represent();
    System.out.println(first.countingPirates());
    second.represent();
    System.out.println(second.countingPirates());

    System.out.println(first.battle(second));

    first.represent();
    System.out.println(first.countingPirates());
    second.represent();
    System.out.println(second.countingPirates());
  }
}

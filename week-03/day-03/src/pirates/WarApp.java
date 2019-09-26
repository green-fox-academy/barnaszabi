package pirates;

public class WarApp {
  public static void main(String[] args) {
    Armada first = new Armada();
    Armada second = new Armada();

    first.fill();
    second.fill();

    System.out.println(first.ships.size());
    System.out.println(second.ships.size());
    System.out.println(first.war(second));
  }
}

package pirates;

public class WarApp {
  public static void main(String[] args) {
    /*Create a WarApp class with a main method
        Create 2 armadas, fill them with ships
    Have a war!*/
    Armada first = new Armada();
    Armada second = new Armada();
    first.fill();
    second.fill();
    first.war(second);
  }
}

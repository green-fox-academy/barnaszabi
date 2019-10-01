package charsequence;

public class Main {
  public static void main(String[] args) {
    Gnirts gnirts = new Gnirts("example");
    System.out.println(gnirts.charAt(1));

    Shifter shifter = new Shifter("example", 41841881);
    System.out.println(shifter.charAt(5418418));
  }
}

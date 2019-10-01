package main.java.music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar(int numberOfStrings) {
    name = "BassGuitar";
    this.numberOfStrings = numberOfStrings;
  }

  public BassGuitar() {
    name = "BassGuitar";
    numberOfStrings = 4;
  }

  @Override
  public void sound() {
    System.out.println("Duum-duum-duum");
  }
}

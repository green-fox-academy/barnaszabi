package main.java.music;

public abstract class StringedInstrument extends Instrument {
  int numberOfStrings;
  @Override
  public void play() {
    sound();
  }

  public abstract void sound();
}

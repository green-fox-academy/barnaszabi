package main.java.music;

public class Violin extends  StringedInstrument{
  public Violin(int numberOfStrings){
    name = "Violin";
    this.numberOfStrings = numberOfStrings;
  }

  public Violin(){
    name = "Violin";
    numberOfStrings = 4;
  }

  @Override
  public void sound() {
    System.out.println("Screech");
  }
}

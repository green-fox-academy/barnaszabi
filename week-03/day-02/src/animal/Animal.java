package animal;

public class Animal {
  int hunger = 50;
  int thirst = 50;

  public void eat(){
    this.hunger--;
  }

  public void drink(){
    this.thirst--;
  }

  public void play(){
    this.hunger++;
    this.thirst++;
  }
}

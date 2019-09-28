package counter;

public class Counter {
  int value;
  int x;

  public Counter(int value) {
    this.value = value;
    x = value;
  }

  public Counter() {
    value = 0;
    x = 0;
  }

  public void add (int number){
    value += number;
  }

  public void add(){
    value++;
  }

  public int get(){
    return value;
  }

  public void reset(){
    value = x;
  }
}

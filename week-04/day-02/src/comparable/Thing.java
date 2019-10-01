package comparable;

public class Thing implements Comparable<Thing> {
  private String name;
  private boolean completed;

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  @Override
  public int compareTo(Thing that) {
    if ((this.completed == false) && (that.completed == true)) {
      return 1;
    } else if (this.completed == that.completed) {
      return this.name.compareTo(that.name);
    } else {
      return -1;
    }
  }
}

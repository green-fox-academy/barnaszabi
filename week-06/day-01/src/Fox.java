public class Fox {
  private String name;
  private String color;
  private int age;

  public String getName() {
    return name;
  }

  public String getColor() {
    return color;
  }

  public int getAge() {
    return age;
  }

  public Fox(String name, String color, int age){
    this.name = name;
    this.color = color;
    this.age = age;
  }

  @Override
  public String toString() {
    return name;
  }
}

package cloneable;

public class Person {
  private String name;
  private int age;
  private String gender;

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + " a " + age + " year old " + gender + ".");
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }

  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public Person() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
  }
}

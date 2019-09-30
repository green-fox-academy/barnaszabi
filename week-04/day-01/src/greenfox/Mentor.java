package greenfox;

public class Mentor extends Person {
  private String level;

  public void getGoal(){
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }

  public void introduce(){
    System.out.println("Hi I'm " + getName() + " a " + getAge() + " year old " + getGender() + " " + level);
  }

  public Mentor(String name, int age, String gender, String level){
    super(name, age, gender);
    this.level = level;
  }

  public Mentor(){
    super();
    level = "intermediate";
  }
}

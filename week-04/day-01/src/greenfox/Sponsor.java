package greenfox;

public class Sponsor extends Person{
  private String company;
  private int hiredStudent;

  public void introduce(){
    System.out.println("Hi I'm " + getName() + " a " + getAge() + " year old " + getGender() + " who represents " + company + " and hired " + hiredStudent + " students so far.");
  }

  public void hire(){
    hiredStudent++;
  }

  public void getGoal(){
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }

  public Sponsor(String name, int age, String gender, String company){
    super(name, age, gender);
    this.company = company;
    hiredStudent = 0;
  }

  public Sponsor(){
    super();
    company = "Google";
    hiredStudent = 0;
  }
}

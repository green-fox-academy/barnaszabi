package teachersandstudents;

public class Student {

  public void learn(){
    System.out.println("the student is learning something new");
  }

  public void question (Teacher teacher){
    teacher.answer();
  }
}

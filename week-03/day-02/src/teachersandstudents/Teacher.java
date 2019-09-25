package teachersandstudents;

public class Teacher {
  public  void teach(Student student){
    student.learn();
  }

  public void answer(){
    System.out.println("the teacher is answering a question");
  }
}

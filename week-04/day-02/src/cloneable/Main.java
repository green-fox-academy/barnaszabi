package cloneable;

public class Main {
  public static void main(String[] args) throws CloneNotSupportedException {
    Student student = new Student("John", 20, "male", "BME");
    Student johnTheClone;
    johnTheClone = (Student) student.clone();
    johnTheClone.introduce();
  }
}

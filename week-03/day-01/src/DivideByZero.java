import java.util.Scanner;

public class DivideByZero {
  public static void divide (int divider)
  {
    try {
      System.out.println(10/divider);
    }catch (ArithmeticException e){
      System.out.println("fail");
    }
  }
  public static void main(String[] args) {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0
    divide(0);
  }
}

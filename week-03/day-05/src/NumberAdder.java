public class NumberAdder {
  public static void main(Strings[] args) {
    //Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
    System.out.println(addingNumber(4));
  }

  public static int addingNumber(int n){
    if (n == 0){
      return 0;
    }else{
      return (n + addingNumber(n - 1));
    }
  }
}

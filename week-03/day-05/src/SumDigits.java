public class SumDigits {
  public static void main(Strings[] args) {
    //Given a non-negative integer n, return the sum of its digits recursively (without loops).
    System.out.println(sumDigits(126));
  }

  public static int sumDigits(int n){
    int temp;
    if (n == 0){
      return 0;
    }else{
      return (n % 10 + sumDigits(n/10));
    }
  }
}

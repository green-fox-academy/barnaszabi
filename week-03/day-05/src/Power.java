public class Power {
  public static void main(Strings[] args) {
    //Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power,
    // so powerN(3, 2) is 9 (3 squared).
    System.out.println(power(3,2));
  }

  public static int power(int base, int n){
    if (n == 1){
      return base;
    }else{
      return (base * power(base, n-1));
    }
  }
}

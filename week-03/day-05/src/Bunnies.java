public class Bunnies {
  public static void main(Strings[] args) {
    //We have a number of bunnies and each bunny has two big floppy ears.
    //We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
    System.out.println(bunnyEars(8));
  }

  public static int bunnyEars(int n){
    if (n == 0) {
      return 0;
    }else{
      return (2 + bunnyEars(n - 1));
    }
  }
}

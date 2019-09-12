import java.util.Scanner;
public class MileToKmConverter
{
    public static void main(String[] args)
    {
        System.out.println("Enter miles in double format (e.g.: x,x): ");
        Scanner scan = new Scanner(System.in);
        double km = scan.nextDouble()*1.609344;
        System.out.println("It's " + km + " in km");
    }
}

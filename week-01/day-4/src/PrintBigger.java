import java.util.Scanner;
public class PrintBigger
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b)
        {
            System.out.println(a + " is the bigger.");
        }
        else if (a < b)
        {
            System.out.println(b + " is the bigger.");
        }
        else
        {
            System.out.println("They are equal.");
        }
    }
}

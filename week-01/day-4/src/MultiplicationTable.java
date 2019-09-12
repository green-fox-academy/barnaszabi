import java.util.Scanner;
public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        for (int i = 0; i < 10; i++)
        {
            System.out.println((i + 1) + " * " + num + " = " + ((i + 1)*num));
        }
    }
}

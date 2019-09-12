import java.util.Scanner;
public class AverageOfInput
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int sum = a+b+c+d+e;
        double avg = (double) sum/5;
        System.out.println("Sum: " + sum + ", Average: " +avg);
    }
}

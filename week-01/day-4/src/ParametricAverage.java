import java.util.Scanner;
public class ParametricAverage
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < count; i++)
        {
            sum += scanner.nextInt();
        }
        double avg = (double)sum/(double)count;
        System.out.println("Sum: " +sum + ", Average: " +avg);
    }
}

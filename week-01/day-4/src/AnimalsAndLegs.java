import java.util.Scanner;

public class AnimalsAndLegs
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of chikens: ");
        int chikensLegs = scanner.nextInt() * 2;
        System.out.println("Enter the number of pigs: ");
        int pigsLegs = scanner.nextInt() * 4;
        int allLegs = chikensLegs + pigsLegs;
        System.out.println("They have " + allLegs + " together");

    }
}

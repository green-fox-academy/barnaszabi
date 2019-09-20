import java.util.Scanner;

public class AnimalsAndLegs
{
    public static void main(String[] args)
    {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of chikens: ");
        int chikensLegs = scanner.nextInt() * 2;
        System.out.println("Enter the number of pigs: ");
        int pigsLegs = scanner.nextInt() * 4;
        int allLegs = chikensLegs + pigsLegs;
        System.out.println("They have " + allLegs + " together");

    }
}

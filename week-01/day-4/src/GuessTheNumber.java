import java.util.Scanner;
public class GuessTheNumber
{
    public static void main(String[] args)
    {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8
        Scanner scanner = new Scanner(System.in);
        int number = 12;
        int guessedNumber;
        do
        {
            System.out.println("Guess a number: ");
            guessedNumber = scanner.nextInt();
            if (guessedNumber > number)
            {
                System.out.println("The stored number is lower");
            }
            else if (guessedNumber < number)
            {
                System.out.println("The stored number is higher");
            }
            else
            {
                System.out.println("You found the number: " +number);
            }
        }
        while (number != guessedNumber);
    }
}

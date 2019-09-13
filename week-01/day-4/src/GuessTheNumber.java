import java.util.Scanner;
public class GuessTheNumber
{
    public static void main(String[] args) {
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

import java.util.Scanner;
public class PartyIndicator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the girls: ");
        int girls = scanner.nextInt();
        System.out.println("Enter the number of the boys: ");
        int boys = scanner.nextInt();
        if (girls == 0)
        {
            System.out.println("Sausage party");
        }
        else
        {
            if ((boys==girls) && ((boys+girls)>=20))
            {
                System.out.println("The party is excellent!");
            }
            else if ((boys!=girls) && ((boys+girls)>=20))
            {
                System.out.println("Quite cool party!");
            }
            else if ((boys+girls)<20)
            {
                System.out.println("Average party...");
            }
        }
    }
}

public class PrintEven
{
    public static void main(String[] args)
    {
        // Create a program that prints all the even numbers between 0 and 500
        int count = -1;
        while (count++ < 500)
        {
            if (count % 2 == 0)
            {
                System.out.println(count);
            }
        }
    }
}

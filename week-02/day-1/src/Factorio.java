public class Factorio
{
    public static int factorio (int input)
    {
        int factorial = 1;
        for (int i = 1; i <= input; i++)
        {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args)
    {
        System.out.println(factorio(5));
    }
}

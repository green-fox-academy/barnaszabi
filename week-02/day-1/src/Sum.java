public class Sum
{
    public static int sum (int input)
    {
        int sum = 0;
        for (int i = 0; i <= input; i++)
        {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(sum(4));
    }
}

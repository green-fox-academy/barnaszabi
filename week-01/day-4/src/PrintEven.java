public class PrintEven
{
    public static void main(String[] args)
    {
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

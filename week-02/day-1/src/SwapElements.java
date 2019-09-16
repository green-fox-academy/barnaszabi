public class SwapElements
{
    public static void main(String[] args)
    {
        String[] abc = new String[] {"first", "second", "third"};
        String temp = abc[0];
        abc[0] = abc[2];
        abc[2] = temp;
        for (int i = 0; i < abc.length; i++)
        {
            System.out.println(abc[i]);
        }
    }
}

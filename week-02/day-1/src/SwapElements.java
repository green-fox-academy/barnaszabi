public class SwapElements
{
    public static void main(String[] args)
    {
        // - Create an array variable named `abc`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `abc`
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

public class Unique
{
    public static String unique (int [] input)
    {
        boolean isItMultiple = false;
        String output = "";
        for (int i = 0; i < input.length ; i++)
        {
            isItMultiple = false;
            for (int j = i-1; j >= 0; j--)
            {
                if (input[i]==input[j])
                {
                    isItMultiple = true;
                }
            }
            if (isItMultiple == false)
            {
                output+=" " + input[i];
            }
        }
        return output;
    }
    public static void main(String[] args)
    {
        System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    }
}

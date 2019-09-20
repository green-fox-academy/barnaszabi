public class Bubble
{
    public static int[] bubble(int[] input)
    {
        int temp;
        for (int i = input.length; i > 0; i--)
        {
            for (int j = 0; j < i-1; j++)
            {
                if (input[j] > input[j+1])
                {
                    temp = input[j+1];
                    input[j+1] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input;
    }
    public static int[] advancedBubble(int[] input, boolean descanting)
    {
     if (descanting)
     {
         int temp;
         for (int i = input.length; i > 0; i--)
         {
             for (int j = 0; j < i-1; j++)
             {
                 if (input[j] < input[j+1])
                 {
                     temp = input[j+1];
                     input[j+1] = input[j];
                     input[j] = temp;
                 }
             }
         }
     }
     else
     {
         bubble(input);
     }
     return input;
    }
    public static void main(String[] args)
    {
        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `true` sort that list descending
        int [] first = bubble(new int[] {34, 12, 24, 9, 5});
        int[] second = advancedBubble(new int[] {34, 12, 24, 9, 5}, true);
        for (int i = 0; i < first.length; i++)
        {
            System.out.print(first[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < second.length; i++)
        {
            System.out.print(second[i] + " ");
        }
    }
}

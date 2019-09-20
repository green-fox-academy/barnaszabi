public class Unique
{
    public static int[] unique (int [] input)
    {
        boolean isItMultiple = false;
        int counter = 0;
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
                counter++;
            }
        }
        int[] unique = new int[counter];
        int k = 0;
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
                unique[k]=input[i];
                k++;
            }
        }
        return unique;
    }
    public static void main(String[] args)
    {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once
        int[] numbers = unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34});
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
    }
}

public class SubInt
{
    public static int[] subInt(int number, int[] numbers)
    {
        String[] numbersInString = new String[numbers.length];
        int j = 0;
        int counter = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            numbersInString[i] = Integer.toString(numbers[i]);
            if (numbersInString[i].contains(Integer.toString(number)))
            {
                counter++;
            }
        }
        int[] indexes = new int[counter];
        for (int i = 0; i < numbers.length; i++)
        {
            numbersInString[i] = Integer.toString(numbers[i]);
            if (numbersInString[i].contains(Integer.toString(number)))
            {
                indexes[j]=i;
                j++;
            }
        }
        return  indexes;
    }
    public static void main(String[] args)
    {
        //  Create a function that takes a number and an array of integers as a parameter
        //  Returns the indices of the integers in the array of which the first number is a part of
        //  Or returns an empty array if the number is not part of any of the integers in the array
        int[] first = subInt(1, new int[] {1, 11, 34, 52, 61});
        int[] second = subInt(9, new int[] {1, 11, 34, 52, 61});
        for (int i = 0; i < first.length; i++)
        {
            System.out.println(first[i]);
        }
        System.out.println("-----------");
        for (int i = 0; i < second.length; i++)
        {
            System.out.println(second[i]);
        }
    }
}

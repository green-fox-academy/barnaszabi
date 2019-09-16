public class SubInt
{
    public static String subInt(int number, int[] numbers)
    {
        String output = "[";
        String[] numbersInString = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++)
        {
            numbersInString[i] = Integer.toString(numbers[i]);
            if (i< numbers.length-1)
            {
                if (numbersInString[i].contains(Integer.toString(number)))
                {
                    output += i + ", ";
                }
            }
            else
            {
                output += i;
            }
        }
        output += "]";
        return  output;
    }
    public static void main(String[] args)
    {
        System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
    }
}

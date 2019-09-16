public class Anagram
{
    public static boolean anagram(String input1, String input2)
    {
        if (input1.length() != input2.length())
        {
            return false;
        }
        else
        {
            int counter = 0;
            for (int i = 0; i < input1.length(); i++)
            {
                for (int j = 0; j < input2.length(); j++)
                {
                    if (input1.charAt(i) == input2.charAt(j))
                    {
                        counter++;
                    }
                }
            }
            if (counter == input1.length())
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    public static void main(String[] args)
    {
        System.out.println(anagram("dog", "god"));
        System.out.println(anagram("green", "fox"));
    }
}
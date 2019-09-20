public class PalindromeSearcher
{
    public static String reverse(String input)
    {
        String output="";
        for (int i = input.length()-1; i >=0 ; i--) {
            output+=input.charAt(i);
        }
        return output;
    }
    public static  boolean isItPalindrome (String input)
    {
        if (input.equals(reverse(input)))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static String[] palindromeSearcher(String input)
    {
        int counter = 0;
        for (int i = 0; i < input.length(); i++)
        {
            for (int j = i+3; j <= input.length() ; j++)
            {
                if (isItPalindrome(input.substring(i,j)))
                {
                    counter++;
                }
            }
        }
        String[] output = new String[counter];
        int k = 0;
        for (int i = 0; i < input.length(); i++)
        {
            for (int j = i+3; j <= input.length() ; j++)
            {
                if (isItPalindrome(input.substring(i,j)))
                {
                    output[k] = input.substring(i,j);
                    k++;
                }
            }
        }
        return output;
    }
    public static void main(String[] args)
    {
        String[] first = palindromeSearcher("dog goat dad duck doodle never");
        String[] second = palindromeSearcher("apple");
        String[] third = palindromeSearcher("racecar");
        String[] fourth = palindromeSearcher("");
        for (int i = 0; i < first.length; i++)
        {
            System.out.println(first[i]);
        }
        System.out.println("----------------");
        for (int i = 0; i < second.length; i++)
        {
            System.out.println(second[i]);
        }
        System.out.println("----------------");
        for (int i = 0; i < third.length; i++)
        {
            System.out.println(third[i]);
        }
        System.out.println("----------------");
        for (int i = 0; i < fourth.length; i++)
        {
            System.out.println(fourth[i]);
        }
        System.out.println("----------------");
    }
}

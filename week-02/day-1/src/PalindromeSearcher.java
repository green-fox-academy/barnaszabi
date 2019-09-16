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
    public static void palindromeSearcher(String input)
    {
        for (int i = 0; i < input.length(); i++)
        {
            for (int j = i+3; j <= input.length() ; j++)
            {
                if (isItPalindrome(input.substring(i,j)))
                {
                    System.out.println(input.substring(i,j));
                }
            }
        }
    }
    public static void main(String[] args)
    {
        palindromeSearcher("dog goat dad duck doodle never");
    }
}

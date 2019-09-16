public class Palindrome
{
    public static String palindrome(String input)
    {
        for (int i = (input.length()-1); i >= 0 ; i--)
        {
            input += input.charAt(i);
        }
        return input;
    }
    public static void main(String[] args)
    {
        System.out.println(palindrome("greenfox"));
        System.out.println(palindrome("123"));
    }
}

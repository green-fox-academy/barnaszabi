public class AppendAFunc
{
    public static String appendAFunc(String input)
    {
        return input += "a";
    }
    public static void main(String[] args)
    {
        String typo = "Chinchill";
        System.out.println(appendAFunc(typo));
    }
}

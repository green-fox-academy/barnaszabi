public class SubStr
{
    public static int SubStr(String input, String q)
    {
        if (input.contains(q))
        {
            return input.indexOf(q);
        }
        else
        {
            return -1;
        }
    }
    public static void main(String[] args)
    {
        //  should print: `17`
        System.out.println(SubStr("this is what I'm searching in", "searching"));

        //  should print: `-1`
        System.out.println(SubStr("this is what I'm searching in", "not"));
    }
}

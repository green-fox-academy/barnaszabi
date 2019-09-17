public class Reverse
{
    public static String reverse(String input)
    {
        String output = "";
        for (int i = input.length()-1; i >= 0; i--)
        {
            output += input.charAt(i);
        }
        return output;
    }
    public static void main(String[] args)
    {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        System.out.println(reverse(reversed));
    }
}

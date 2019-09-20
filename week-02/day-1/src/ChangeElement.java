public class ChangeElement
{
    public static void main(String[] args)
    {
        // - Create an array variable named `s`
        //   with the following content: `[1, 2, 3, 8, 5, 6]`
        // - Change the 8 to 4
        // - Print the fourth element
        int[] s = new int[] {1, 2, 3, 8, 5, 6};
        s[3] = 4;
        System.out.println("The fourth element is "+ s[3]);
    }
}

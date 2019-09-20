public class CompareLength
{
    public static void main(String[] args)
    {
        // - Create an array variable named `p1`
        //   with the following content: `[1, 2, 3]`
        // - Create an array variable named `p2`
        //   with the following content: `[4, 5]`
        // - Print "p2 is longer" if `p2` has more elements than `p1`
        int[] p1 = new int[] {1, 2, 3};
        int[] p2 = new int[] {4, 5};
        if (p2.length > p1.length)
        {
            System.out.println("p2 is longer.");
        }
        else if (p2.length < p1.length)
        {
            System.out.println("p1 is longer.");
        }
        else
        {
            System.out.println("They have the same length.");
        }
    }
}

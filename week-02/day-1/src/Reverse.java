public class Reverse
{
    public static void main(String[] args)
    {
        // - Create an array variable named `aj`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `aj`
        // - Print the elements of the reversed `aj`
        int[] aj = new int[] {3, 4, 5, 6, 7};
        int temp;
        int i = 0;
        int j = aj.length-1;
        while (j > i)
        {
            temp = aj[i];
            aj[i] = aj[j];
            aj[j] = temp;
            i++;
            j--;
        }
        for (int k = 0; k < aj.length; k++)
        {
            System.out.println(aj[k]);
        }
    }
}

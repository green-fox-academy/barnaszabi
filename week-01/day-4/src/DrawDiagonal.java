import java.util.Scanner;
public class DrawDiagonal
{
    public static void main(String[] args)
    {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        for (int i = 0; i < lines; i++)
        {
            for (int j = 0; j < lines; j++)
            {
                if ((j==0) || (j == lines-1) || (i==0) || (i == lines-1) || (i == j))
                {
                    System.out.print("\t%");
                }
                else
                {
                    System.out.print("\t ");
                }
            }
            System.out.println();
        }
    }
}

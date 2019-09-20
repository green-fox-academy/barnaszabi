import java.util.Scanner;
public class DrawPyramid
{
    public static void main(String[] args)
    {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        int lastLineLength= lines + lines - 1;
        int middle = lastLineLength  / 2;
        int currentStars=1;
        int starStart;
        int starEnd;
        for (int i = 0; i < lines; i++)
        {
            for (int j = 0; j < lastLineLength; j++)
            {
                starStart = middle - (currentStars/2+1);
                starEnd = middle + (currentStars/2+1);
                if ((j >starStart) && (j < starEnd))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            currentStars += 2;
        }
    }
}

import java.util.Scanner;
import  java.math.RoundingMode;
public class DrawDiamond
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        int middleLineLength= lines + lines - 1;
        int middle = middleLineLength  / 2;
        int currentStars=1;
        int starStart;
        int starEnd;
        for (int i = 0; i < lines; i++)
        {
            for (int j = 0; j < middleLineLength; j++)
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
            if (lines % 2 != 0)
            {
                if (i < (lines-1)/2)
                {
                    currentStars += 2;
                }
                else
                {
                    currentStars -= 2;
                }
            }
            //not a diamond
            else
            {
                if (i < (lines)/2)
                {
                    currentStars += 2;
                }
                else
                {
                    currentStars -= 2;
                }
            }
        }
    }
}

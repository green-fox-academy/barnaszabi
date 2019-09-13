import java.util.Scanner;
public class DrawDiagonal
{
    public static void main(String[] args)
    {

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

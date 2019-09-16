public class DiagonalMatrix
{
    public static void main(String[] args)
    {
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (i == j)
                {
                    matrix[i][j] = 1;
                }
                else
                {
                    matrix[i][j] = 0;
                }
                System.out.print("\t"+matrix[i][j]);
            }
            System.out.println();
        }

    }
}

public class TransposeMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},
                         {4,5,6}
                         };
        int row=(matrix.length);
        int col=(matrix[0].length);
        int mat[][]=new int[row][col];
        int in=0;
        System.out.println(matrix[1][0]);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                mat[i][j]=matrix[j][in];
            }            
            in++;
        }
        


    }
}

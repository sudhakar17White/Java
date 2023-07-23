import java.util.Scanner;
public class Toeplitz_Matrix {
    static int Toeplitz(int row,int col,int ar[][])
    {
        int x=0;
        int y=0;
        System.out.print(ar[row-1][0]+" ");
       
            for(int r=0;r<col;r++)
            {
                int ch=ar[y][r];
                for(int c=0;c<row;c++)
                {
                    if(ch==ar[x][c])
                    {
                        System.out.print(ar[x][c]);
                    }
                    x++;
                    
                }
                x=0;
                x+=1;
                y++;
               
            }
             

        
        System.out.print(ar[0][col-1]+" ");
        return y;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        
        int ar[][]=new int[row][col];
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                ar[i][j]=s.nextInt();
            }
        }

        Toeplitz(row,col,ar);
       
       

    }
}

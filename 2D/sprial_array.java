import java.util.Scanner;
class sprial_array{
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

        int right=0;
        int left=col;
        int bottom=row-1;
        int top=0;
        int len=row*col;
        
        while(len!=0)
        {
         //top->right to left
            for(int i=right;i<left;i++)
            {
                System.out.print(ar[right][i]+" ");
                len--;
            }
            
            top++;
            //right side to down
            for(int i=top;i<=bottom;i++)
            {
                System.out.print(ar[i][bottom]+" ");
                len--;
            }
            left--;

            //left to right
            for(int i=left-1;i>=0;i--)
            {
                System.out.print(ar[left][i]+" ");
                len--;
            }
            bottom--;
            //down to up left
            for(int i=bottom;i>top-1;i--)
            {
                System.out.print(ar[i][right]+" ");
                len--;
            }
            right++;
            
            
        }
       
    }
}
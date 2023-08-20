package Max_sum_of_hourglass;
import java.util.*;
public class sum_hourGlass {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int row=s.nextInt();
        int col=s.nextInt();
        int grid[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                grid[i][j]=s.nextInt();
            }
        }
        int sum=0;
        int ch=0;
       
        if(col>3)
        {
            col=col-1;
        }
        a:
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==0||i==2||j==1)
                {
                    if(ch==3)
                    {
                        break a;
                    }
                    System.out.println(grid[i][j]);
                    sum=sum+grid[i][j];
                    
                    
                }
            }
            ch++;
        }
        System.out.println(sum);



    }
}

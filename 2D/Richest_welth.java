import java.util.Arrays;
import java.util.Scanner;
public class Richest_welth {
    static int max(int row,int[] max)
    {
        int m=max[0];
        for(int i=1;i<max.length;i++)
        {
            if(m<max[i])
            {
                m=max[i];
            }
        }
        return m;
    }
    static void welth(int ar[][],int row,int col,int max[])
    {
        int inc=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                max[inc]=max[inc]+ar[i][j];
            }
            inc++;
        }
        for(int i=0;i<max.length;i++)
        {
            System.out.println((i+1)+" customer has weltth ="+max[i]);
        }
        System.out.println(max(row,max));
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        int ar[][]=new int[row][col];
        int max[]=new int[row];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                ar[i][j]=s.nextInt();
            }
        }
        welth(ar,row,col,max);

    }
}

import java.util.Scanner;
public class parrell_Array {

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

         int inc=0;
         int dec=col;
         for(int i=0;i<row/2;i++)
         {
            for(int j=0;j<col;j++)
            {
                System.out.print(ar[inc][j]*ar[dec][j]+" ");
            }
            inc++;
            dec--;
            System.out.println("");
         }

    }
}
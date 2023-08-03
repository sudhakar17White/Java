package Dimond_pattern;
import java.util.*;

public class dimond_pattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int len=s.nextInt();
        for(int i=1;i<=len;i++)
        {
            for(int j=1;j<=len-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++)
            {
                System.out.print("*");
            }
             System.out.println();
        }
        for(int i=len;i>=1;i--)
        {
            for(int j=1;j<=len-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++)
            {
                System.out.print("*");
            }
             System.out.println();
        }
       


    }
}

package Hotel_Duoble_cross;

import java.util.Arrays;
import java.util.Scanner;

public class HotelDuobleCross {
    static int posnum(int num,int fi[],int se[],int th[],int fo[],int i)
    {
         int co=0;
          String no="";
        if(i==0)
        {
           
           int j=0;
           while(co!=num)
           {
                co++;
                if(j==fi.length)
                {
                    j=0;
                }
                no=no+fi[j];
                j++;
           }
           
           return Integer.parseInt(""+no.charAt(j-1));
        }
        else if(i==1)
        {
             int j=0;
           while(co!=num)
           {
                co++;
                if(j==fi.length)
                {
                    j=0;
                }
                no=no+se[j];
                j++;
           }
          
           return Integer.parseInt(""+no.charAt(j-1));

        }
        else if(i==2)
        {
              int j=0;
           while(co!=num)
           {
                co++;
                if(j==fi.length)
                {
                    j=0;
                }
                no=no+th[j];
                j++;
           }
          return Integer.parseInt(""+no.charAt(j-1));

        }
        else if(i==3)
        {
             int j=0;
           while(co!=num)
           {
                co++;
                if(j==fi.length)
                {
                    j=0;
                }
                no=no+fi[j];
                j++;
           }
         return Integer.parseInt(""+no.charAt(j-1));
        }

        return 0;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int fi[]=new int[size];
        int sc[]=new int[size];
        int th[]=new int[size];
        for(int i=0;i<size;i++)
        {
            fi[i]=s.nextInt();
            sc[i]=s.nextInt();
            th[i]=s.nextInt();
        }
        int fo[]=new int[size];
        for(int i=0;i<size;i++)
        {
            fo[i]=fi[i]+sc[i]+th[i];
        }
        System.out.println(Arrays.toString(fo));
        int ans=0;
        for(int i=0;i<size;i++)
        {
            System.out.print(posnum(fo[i],fi,sc,th,fo,i)+"+");
            ans=ans+posnum(fo[i],fi,sc,th,fo,i);
        }
        System.out.print("= "+ans);
    }
}

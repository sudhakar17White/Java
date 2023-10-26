package Number_Increment_pattern;

import java.util.ArrayList;
import java.util.Arrays;

public class Number_Inc {
    public static void main(String[] args) {
        String get[]="5/3".split("/");
        int num=Integer.parseInt(get[0]);
        int digit=Integer.parseInt(get[1]);
        
        //String ar[]=new String[num*num];
        String zero="";
        ArrayList<String> ar=new ArrayList<String>();
        if(digit==1)
        {
            for(int i=1;i<=num;i++)
            {
                for(int j=1;j<=num;j++)
                {
                    System.out.print(j+" ");
                }
                System.out.print("0\n");
            }
        }
        else
        {
        for(int i=0;i<digit-1;i++)
        {
            zero=zero+"0";
        }
        for(int i=1;i<=num*num;i++)
        {   if(String.valueOf(i).length()==1)
            {
                ar.add(zero.substring(0, zero.length())+i);
            }
            else
            {
                ar.add(zero.substring(0, zero.length()-1)+i);
            }
        }
        int in=1;
        for(int i=0;i<num*num;i++)
        {
            System.out.print(ar.get(i)+" ");
            if(in==num)
            {
                System.out.println("\n");
                in=1;
            }
            in++;
        }


        }

        


    }
}

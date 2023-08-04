package Minmum_sum;

import java.util.*;

public class minmum_sum {
     public static void main(String[] args) {

Scanner s=new Scanner(System.in);
int len=s.nextInt();
int n=s.nextInt();
int ar[]=new int[len*(len-1)];
int a[]=new int[len];
for(int i=0;i<len;i++)
{
    a[i]=s.nextInt();
}
int sum=0;
int in=0;

    for(int k=0;k<len;k++)
    {  
       for(int j=0;j<len;j++)
       {
           if(k!=j)
           {
               ar[in]=a[k]+a[j];
               in++;
              
           }
       }
    
    }
System.out.println(Arrays.toString(ar));
int min=ar[0];
for(int i=1;i<ar.length;i++)
{
    if(min>ar[i])
    {
        min=ar[i];
    }
}
System.out.println(min);


}
}

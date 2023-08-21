package Transfrom_code_operation;
import java.util.*;
public class code {
    static int di(int d)
    {
        int n=0;
        while(d!=0)
        {
            d=d/10;
            n++;
        }
        return n;
    }
    static int isprime(int n)
    {
        int i,m=0,flag=0;      
  m=n/2;      
  if(n==0||n==1){  
        
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
          
     flag=1;      
     break;      
    }      
   }      
   if(flag==0) 
    { 
    return 1; 
    }  
  }
return 0;
}
static int sum(int num)
{
    int sum=0;
    while(num!=0)
    {
        int a=num%10;
        sum=sum+a;
        num=num/10;
    }
    return sum;
}
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num[]={12};
        String ans="";
            if(di(num[0])==6)
            {
                ans=ans+"C";
            }
            else
            {
                ans=ans+"W";
                //System.out.println(ans);
                if(isprime(num[0])==1)
                {
                    ans=ans+"P";
                }
                else
                {
                    ans=ans+"N";
                    int nu=sum(num[0]);
                    ans=ans+""+nu;
                    if(num[0]%2==0)
                    {
                        ans=ans+num[0]/2;
                    }
                }
            }
        
        System.out.println(ans);
    }
}

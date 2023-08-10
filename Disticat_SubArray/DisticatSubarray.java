package Disticat_SubArray;
import java.util.*;

public class DisticatSubarray {
    public static void main(String[] args) {
        //inputs
        int ar[]={1,2,1,5,4};
        int less=7;
        //----------------------
        int mi=0;
        int len=ar.length;
        int sum=0;
        int index[]=new int[ar.length*ar.length];
        int leng[]=new int[ar.length*ar.length];
        int inx=0,in=0;

        while(mi!=ar.length)
        {
             
            for(int i=0;i<ar.length;i++)
            {   
               
                for(int j=i;j<len;j++)
                {
                    sum=sum|ar[j];
                    in++;
                    
                }
                index[inx]=in;
                leng[inx]=sum;
                inx++;
                in=0;
                
                sum=0;
                
            }
            len--;
            mi++;
        }  
       int num=0;
       for(int i=0;i<leng.length;i++)
       {
            if(leng[i]==less)
            {
                num++;
            }
       }
       int ans[]=new int[num];
       int n=0;
       for(int i=0;i<leng.length;i++)
       {
           if(leng[i]==less)
           {
                ans[n]=i;
                n++;
           }
       }
       int min=index[ans[0]];
       for(int i=1;i<ans.length;i++)
       {
            if(min>index[ans[i]])
            {
                min=index[ans[i]];
            }
       }
       System.out.println(min);
    }
}

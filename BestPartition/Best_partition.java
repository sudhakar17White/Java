package BestPartition;
import java.util.*;
public class Best_partition {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int ar[]={1,2,3,4}; //Input for array 
        int len=2; //len of sub
        if(ar.length==len)
        {
            int min=ar[0];
            for(int i=1;i<ar.length;i++)
            {
                if(ar[i]<min)
                {
                    min=ar[i];
                }
            }
            System.out.println(min);
        }
        else
        {
            ArrayList<Integer> arl=new ArrayList<>();
            int si=(ar.length/len)+1;
            System.out.println(si);
            while(si!=0)
            {
                int odd=0,even=0,in=0;
                for(int i=0;i<ar.length;i++)
                {

                    if(in==si)
                    {
                        even=even+ar[i];
                    }
                    else
                    {
                        odd=odd+ar[i];
                    }
                        in++;
                }
                if(even<odd)
                {
                   // System.out.println(even);
                    arl.add(even);
                }
                
                si--;
            }
           // System.out.println(arl);
            System.out.println(Collections.max(arl));
        }
    }
}

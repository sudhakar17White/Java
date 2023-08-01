package sum_prev_value;
import java.util.*;

public class sum_prev {
    static void sumprev(int ar[])
    {
        int sum=0;
        for(int i=0;i<ar.length;i++)
        {
            if((ar.length)-1!=i)
            {
                if(ar[i]>ar[i+1])
                {
                    sum=sum+ar[i];
                }
            }
            else
            {
                break;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int l=s.nextInt();
        int ar[]=new int[l];
        for(int i=0;i<l;i++)
        {
            ar[i]=s.nextInt();
        }
        sumprev(ar);

    }
}

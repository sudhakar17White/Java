import java.util.Arrays;

public class CountingBits {
        static int count(int val)
        {
            int count=0;
            String ns=Integer.toBinaryString(val);
            for(int i=0;i<ns.length();i++)
            {
                if(ns.charAt(i)=='1')
                {
                    count++;
                }
            }
            return count;
        }
    public static void main(String[] args) {
        int n = 2;
        int ar[]=new int[n+1];
        ar[0]=0;
        for(int i=1;i<=n;i++)
        {
            ar[i]=count(i);
        }
        System.out.println(Arrays.toString(ar));
    }
}

import java.util.Arrays;

public class MaximumSumWithExactlyKElements {
    static int total(int ar[])
    {
        int to=0;
        for(int i=0;i<ar.length;i++)
        {
            to=to+ar[i];
        }
        return to;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        int k=3;
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int total=total(nums);
        int ar[]=new int[k];
        for(int i=0;i<k;i++)
        {
                ar[i]=max+i;
            
        }
        int total2=total(ar);
        if(total<total2)
        {
            System.out.println(total2);
        }
        else if(total>total2) 
        {
            System.out.println(total);
        }
        System.out.println(total+" "+total2);

      }
}

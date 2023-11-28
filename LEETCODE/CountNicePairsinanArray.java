public class CountNicePairsinanArray {
    static int rev(int num1)
    {
        int res=0;
        while(num1!=0)
        {
            int a=num1%10;
            res=res*10+a;
            num1=num1/10;
        }
        return res;
    }
    public static void main(String[] args) {
        int nums[] = {13,10,35,24,76};
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            
            for(int j=i+1;j<nums.length;j++)
            {
                if((rev(nums[i])+nums[j])==(nums[i]+rev(nums[j])))
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

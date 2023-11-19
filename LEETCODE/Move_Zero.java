import java.util.Arrays;

public class Move_Zero {
    public static void main(String[] args) {
        int nums[]={0,1,0,3,12};
        Arrays.sort(nums);
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                index=i;
                break;
            }
            
        }
        int ans[]=new int[nums.length];
        int in=0;
        for(int i=index;i<ans.length;i++)
        {
            ans[in]=(nums[i]);
            in++;
        }
        for(int i=in;i<ans.length;i++)
        {
            ans[i]=0;
        }
        System.out.print(Arrays.toString(ans));
    }
}

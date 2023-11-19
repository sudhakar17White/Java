import java.util.Arrays;

public class MinimizeMaximumPairSuminArray {
    public static void main(String[] args) {
            int nums[]={3,5,2,3};
            Arrays.sort(nums);
            int fr=0;
            int bk=nums.length-1;
            int ans[]=new int[nums.length/2];
            if(nums.length%2==0)
            {
                for(int i=0;i<ans.length;i++)
                {
                    ans[i]=nums[fr]+nums[bk];
                    fr++;
                    bk--;
                }
            }
            Arrays.sort(ans);
            System.out.println(ans[ans.length-1]);

            
    }
}

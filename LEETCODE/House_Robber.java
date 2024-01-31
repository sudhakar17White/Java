public class House_Robber {
    public static void main(String[] args) {
        int nums[]={1,3,1};
        int ans=0;
        int in=1;
        for(int i=0;i<nums.length;i++)
        {
            if(in%2!=0)
            {
                ans=ans+nums[i];
                
            }
            in++;
        }
        System.out.println(ans);
        
    }
        
}

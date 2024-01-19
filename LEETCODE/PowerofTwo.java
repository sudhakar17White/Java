public class PowerofTwo {
    static int power(int n)
    {
        int ans=1;
        for(int i=0;i<=n;i++)
        {
            ans=ans*2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=16;
        boolean ans=false;
        for(int i=0;i<=n;i++)
        {
            if(n==power(i)||n==1)
            {
                ans=true;
                break;
            }
            
            
            
        }
        System.out.println(ans);
    }
}

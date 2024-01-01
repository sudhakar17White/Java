public class HappyNumber {
    static int hpnum(int num)
    {
        int ans=0;
        while(num!=0)
        {
            int a=num%10;
            ans=ans+(a*a);
            num=num/10;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 19;
        while(n!=1)
        {
            n=hpnum(n);
           
        }
        if(n!=1)
        {
            System.out.println("False");
        }
        else
        {
            System.out.println("True");
        }
    }
}

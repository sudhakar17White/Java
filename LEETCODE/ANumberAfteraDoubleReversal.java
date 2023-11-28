public class ANumberAfteraDoubleReversal {
    
    static int rev(int num)
    {
        int res=0;
        while(num!=0)
        {
            int a=num%10;
            res=res*10+a;
            num=num/10;
        }

        return res;
    }
    public static void main(String[] args) {
        int num = 526;
        final int n=num;
        int i=1;
        //int n=0;
        while(i!=3)
        {
            num=rev(num);
            i++;
        }
        
        System.out.println(num==n);
    }
}

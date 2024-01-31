public class powerfour {
    static int power(int n)
    {
        int pw=1;
        int i=0;
        while(i!=n)
        {
            if(pw==n)
            {
                break;
            }
            else
            {
                pw=4*i;
            }
            i++;
        }

        return pw;
    }
    public static void main(String[] args) {
        int n=1;
        System.out.println(n==(power(n))?true:false);
        
    }
}

public class DecryptStringfromAlphabettoIntegerMapping {
    public static void main(String[] args) {
        String s="10#11#12";
        String abc=" abcdefghijklmnopqrstuvwxyz";
        String ans="";
        int i=s.length()-1;
        for(;i>=0;i--)
        {
            if(s.charAt(i)=='#')
            {
                ans=ans+(abc.charAt(Integer.parseInt(s.substring(i-2, i))));
                i=i-2;
                if(i<=0)
                {
                    break;
                }
            }
            else
            {
                
                ans=ans+(abc.charAt(Integer.parseInt(""+s.charAt(i))));
            }
        }
        
        System.out.println(""+new StringBuilder(ans).reverse());
    }
}

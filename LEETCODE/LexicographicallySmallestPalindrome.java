public class LexicographicallySmallestPalindrome {
    public static void main(String[] args) {
        String s = "abcd";
        String cpy=s;
        String alp=" abcdefghijklmnopqrstuvwxyz";
        a:
        for(int i=0;i<cpy.length();i++)
        {
            for(int j=1;j<=26;j++)
            {
                cpy=cpy.replace(cpy.charAt(i), alp.charAt(j));
                if(cpy.equals(""+new StringBuilder(cpy).reverse()))
                {
                    System.out.println(cpy);
                    break a; 
                }
                else
                {
                    cpy=s;
                }
                
            }
            

        }
    }
}

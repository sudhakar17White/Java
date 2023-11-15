
public class FaultyKeyboard {
   
       
    
    public static void main(String[] args) {
        String s="poiinter";
        int i=0;
        int len=s.length();
        String ans="";
        int in=0;
        while(i!=len)
        {
            if(s.charAt(i)=='i')
            {
                StringBuilder str=new StringBuilder(s.substring(0, i));
                in=i;
                ans=ans+str.reverse();
            }
            i++;
        }
        System.out.println(ans+s.substring(in+1, s.length()));
    }
    
}
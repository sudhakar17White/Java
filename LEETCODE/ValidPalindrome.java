import java.util.Arrays;

public class ValidPalindrome {
   public static void main(String[] args) {
        String a="A man, a plan, a canal: Panama";
        String ar[]=a.split(" ");
        String af="";
        for(int i=0;i<ar.length;i++)
        {
            af=af+ar[i];
        }
        af=af.toLowerCase();
        String ans="";
        for(int i=0;i<af.length();i++)
        {
            if(Character.isAlphabetic(af.charAt(i)))
            {
                ans=ans+(af.charAt(i));
            }
        }
        
        StringBuilder str=new StringBuilder(ans);
        String res=""+str.reverse();
        if(res.equals(ans))
        {
            System.out.println("palinrome");
        }
        
   } 
}

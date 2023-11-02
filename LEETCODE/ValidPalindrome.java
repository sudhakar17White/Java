import java.util.Arrays;

public class ValidPalindrome {
   public static void main(String[] args) {
        String a="a.";
        if(a.length()==1)
        {
            System.out.println("palinrome");
        }
        else
        {
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
            if(Character.isLetterOrDigit(af.charAt(i)))
            {
                ans=ans+(af.charAt(i));
            }
        }
        System.out.println(ans);
        StringBuilder str=new StringBuilder(ans);
        String res=""+str.reverse();
        if(res.equals(ans)&&res.length()==1)
        {
            System.out.println("palinrome");
        }
        else
        {
            System.out.println("not");
        }
    }
        
   } 
}

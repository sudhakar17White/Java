import java.util.Arrays;

public class ReverseWordsinaStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        StringBuilder str=new StringBuilder(s);
        s=""+str.reverse();
        String ar[]=s.split(" ");
        s="";
        for(int i=ar.length-1;i>=0;i--)
        {
            s=s+ar[i]+" ";
        }
        System.out.println(s.trim());
        
    }
}

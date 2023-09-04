package Find_The_Order;
import java.util.*;
public class FindTheOrder {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word1=s.nextLine();
        String word2=s.nextLine();
        int postion=0;
        if(word1.length()==word2.length())
        {
            for(int i=0;i<word1.length();i++)
            {
                if(word1.charAt(i)==word2.charAt(i))
                {
                    postion++;
                }
            }
        }
        int to=(word1.length()-postion);
        if(to==2)
        {
            System.out.println("Increaseing:"+to);
        }
        else if(to==3)
        {
            System.out.println("Decreseing:"+to);
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}

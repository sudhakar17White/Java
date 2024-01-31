import java.util.Arrays;
import java.util.HashMap;

public class FirstUniqueCharInString {
    public static void main(String[] args) {
        String s="loveleetcode";
        s=s.toLowerCase();
        HashMap<Character,Integer>hs=new HashMap<Character,Integer>();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    count++;
                }
            }
            hs.put(s.charAt(i), count);
            count=0;
        }
        int res=-1;
        for(int i=0;i<s.length();i++)
        {
            if(hs.get(s.charAt(i))==1)
            {
                res=(i);
                break;
            }
        }

        
    }
}

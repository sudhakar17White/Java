import java.util.HashMap;
import java.util.HashSet;

public class DecodetheMessage {
    public static void main(String[] args) {
        String key="the quick brown fox jumps over the lazy dog";
        HashSet<Character> hs=new HashSet<>();
        int in=0;
        String wr="";
        for(int i=0;i<key.length();i++)
        {
            if(key.charAt(i)!=' ')
            {
                if(!hs.contains(key.charAt(i)))
                {
                    wr=wr+(key.charAt(i));
                    hs.add(key.charAt(i));
                }
                
            }
        }
        HashMap<Character,Character> ans=new HashMap<>();
        for(int i=97;i<123;i++)
        {
            ans.put(wr.charAt(in),(char)i);
            in++;
            
        }
        String message = "vkbs bs t suepuv";
        
        for(int i=0;i<message.length();i++)
        {
            if(message.charAt(i)==' '){
                System.out.print(" ");
            }
            else
            {
                System.out.print(ans.get(message.charAt(i)));
            
            }

        }

    }
}

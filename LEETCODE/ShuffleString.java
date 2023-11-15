import java.util.HashMap;

public class ShuffleString {
    public static void main(String[] args) {
        String s="abc";
        int num[]={0,1,2};
        String ans="";
        HashMap<Integer,String> hs=new HashMap<>();
        for(int i=0;i<num.length;i++)
        {
            hs.put(num[i], ""+s.charAt(i));
        }
        for(int i=0;i<hs.size();i++)
        {
            ans=ans+hs.get(i);
        }
        
        System.out.println(ans);

    }
}

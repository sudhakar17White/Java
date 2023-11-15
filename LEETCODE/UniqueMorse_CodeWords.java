import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueMorse_CodeWords {
    public static void main(String[] args) {
        HashMap<String,String> hs=new HashMap<>();
        hs.put("a", ".-");hs.put("b","-...");hs.put("c", "-.-.");hs.put("d", "-..");hs.put("e",".");
        hs.put("f","..-.");hs.put("g","--.");hs.put("h","....");hs.put("i","..");hs.put("j",".---");
        hs.put("k","-.-");hs.put("l",".-..");hs.put("m","--");hs.put("n","-.");hs.put("o","---");
        hs.put("p",".--.");hs.put("q","--.-");hs.put("r",".-.");hs.put("s","...");hs.put("t","-");hs.put("u","..-");
        hs.put("v","...-");hs.put("w",".--");hs.put("x","-..-");hs.put("y","-.--");hs.put("z","--..");
        
        
        String wrd[]={"gin","zen","gig","msg"};
        String ans[]=new String[4];
        for(int i=0;i<wrd.length;i++)
        {
            String add="";
           for(int j=0;j<wrd[i].length();j++)
           {
                add=add+hs.get((""+wrd[i].charAt(j)).toLowerCase());
           }
           ans[i]=add;
           add="";     
        }
        Set<String> uniqueStrings = new HashSet<>();

        for (String str : ans) {
            uniqueStrings.add(str);
        }
        System.out.println(uniqueStrings.size());
        

        }
}

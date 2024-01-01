import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceWords {
    public static void main(String[] args) {
        List<String>dictionary = new ArrayList<String>();
        dictionary.add("cat");
        dictionary.add("bat");
        dictionary.add("rat"); 
        String sentence = "the cattle was rattled by the battery";
        String ar[]=sentence.split(" ");
        int j;
       String ans="";
       for(int i=0;i<ar.length;i++)
        {
            for(j=0;j<dictionary.size();j++)
            {
                if((ar[i].length()>=dictionary.get(j).length())&&((ar[i].substring(0,dictionary.get(j).length()).equals(dictionary.get(j)))))
                {
                    
                    ar[i]=dictionary.get(j);
                }

            }
            j=0;
        }
        for(int i=0;i<ar.length;i++)
        {
            ans=ans+ar[i]+" ";
        }
        System.out.println(ans.trim());
    }
}

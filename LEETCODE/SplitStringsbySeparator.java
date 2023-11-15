import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitStringsbySeparator {
    public static void main(String[] args) {
       
        List<String> words=new ArrayList<String>();
       
        words.add("$$.o.$$.");
       
        String all="";
        for(int i=0;i<words.size();i++)
        {
            all=all+(words.get(i).replace('$',' ').trim())+" ";
        }
        String ans[]=all.split(" ");
        System.out.println(Arrays.toString(ans));
        System.out.println(ans[1]);
        ArrayList<String> an=new ArrayList<>();
        for(int i=0;i<ans.length;i++)
        {
            if(!ans[i].equals(""))
            {
                an.add(ans[i]);
            }
        }
        System.out.println(an);
    }
}

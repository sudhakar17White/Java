import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class Sort_the_pepole {
    public static void main(String[] args) {
        String po[]={"Mary","John","Emma"}; 
        int hign[]={180,165,170};
        
        HashMap<Integer,String> hs=new HashMap<>();
        for(int i=0;i<po.length;i++)
        {
            hs.put(hign[i], po[i]);
        }
        TreeMap<Integer,String> tm=new  TreeMap<Integer,String> (hs);
        System.out.println(tm);
        Arrays.sort(hign);
        int in=0;
        for(int i=hign.length-1;i>=0;i--)
        { 
            po[in]=tm.get(hign[i]);
            in++;
        }
        System.out.println(Arrays.toString(po));
        
    }
}

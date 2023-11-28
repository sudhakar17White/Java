import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MinimizeStringLength {
    public static void main(String[] args) {
        String s = "cbbd";
        char ar[]=s.toCharArray();
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]==ar[j])
                {
                    ar[i]='0';
                    count++;
                }
            }
        }
        
        System.out.println(ar.length-count);
        //System.out.println(hs.size());
    }
}

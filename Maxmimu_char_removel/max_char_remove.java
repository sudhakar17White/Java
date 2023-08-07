package Maxmimu_char_removel;
import java.util.*;

public class max_char_remove {
    
    public static void main(String[] args) {
        String s="abcacb";
        String p="ab";
        int removalbe[]={3,1,0};
        String ar[]=s.split("");
        int t=0;
        System.out.println(Arrays.toString(ar));
        for(int i=0;i<removalbe.length;i++)
        {
            ar[removalbe[i]]="";
            int count=1;
            for(int j=0;j<ar.length;j++)
            {
                
                for(int k=0;k<p.length();k++)
                {
                    if(ar[j].charAt(0)==p.charAt(k))
                    {
                        count++;
                    }

                }
                if(count<3)
                {
                    break;
                }
                
            }
            t++;
            
            System.out.println(Arrays.toString(ar));
        }
        
    }
}

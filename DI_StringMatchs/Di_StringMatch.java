package DI_StringMatchs;
import java.util.*;

public class Di_StringMatch {
    static void di_str(String word)
    {
       
        int ar[]=new int[word.length()+1];
        ar[0]=0;
        int in=0;
        int high=word.length();
        int low=1;
        for(int i=1;i<ar.length;i++)
        {
            if(word.charAt(in)=='I')
            {
                ar[i]=low;
                low=low+1;
                in++;
            }
            else if(word.charAt(in)=='D')
            {
                    ar[i]=high;
                    high=high-1;
                    in++;
            
            }
            else
            {
                break;
            }
        }
        System.out.println(Arrays.toString(ar));
    }
    public static void main(String[] args) {
        di_str(new Scanner(System.in).nextLine());
    }
}

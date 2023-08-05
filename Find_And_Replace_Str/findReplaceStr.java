package Find_And_Replace_Str;
import java.util.*;

public class findReplaceStr {
    public static void main(String[] args) {
        String s = "abcd";
        int indices[]= {0, 2};
        String sources[]= {"a", "cd"};
        String targets[]= {"eee", "ffff"};
        int index1=indices[0];
        int index2=indices[1];
        int i=0;
        String ans="";
        int flag=0;
        while(i!=2)
        {
           // System.out.println(sources[i].charAt(0));
            for(int j=0;j<s.length();j++)
            {
                if(sources[i].charAt(0)==s.charAt(j))
                {
                    
                    ans=ans+targets[i];
                    //System.out.println(ans);
                    flag=1;
                    break;
                    
                }
                
            }
           
            if(flag==0)
            {
                ans=ans+s.substring(index2, s.length());
                flag=1;
                break;
            }
            flag=0;
            i++;
        }
        if(flag==0)
        {
             System.out.println(targets[0]+s.charAt(1)+targets[1]);
        }
        else
        {
            System.out.println(ans);
        }
    }
}

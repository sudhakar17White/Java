package Pied_Piper;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class pied_piper {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();
       
        while(word.length()!=56)
        {
            word="0"+word;
        }
        System.out.println(word);
        Map<String,String> hs=new HashMap<String,String>(){{
    put("10", "a");
    put("11", "b");
    put("12", "c");
    put("13", "d");
    put("14", "e");
    put("15", "f");
}};
        int st=0;
        int end=4;
        System.out.println(hs.get("10"));
        String ans="";
        for(int i=0;i<word.length()/4;i++)
        {
            int a=(Integer.parseInt(""+word.subSequence(st, end),2));
            //System.out.println(a);
           
            if(a<10)
            {
                 System.out.print(a);
               
            }
            else
            {
               System.out.print(hs.get(String.valueOf(a)));
            }
            st=end;
            end=end+4;
        }
       
        System.out.println(ans);
       
    }
}

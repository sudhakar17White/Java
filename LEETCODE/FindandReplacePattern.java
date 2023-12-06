import java.util.ArrayList;

public class FindandReplacePattern {
    public static void main(String[] args) {
       String words[] = {"abc","deq","mee","aqq","dkd","ccc"};
       String pattern = "abb";
       String ans="";
       int count=0;
       for(int i=0;i<pattern.length();i++)
       {
            for(int j=0;j<pattern.length();j++)
            {
                if(pattern.charAt(i)==pattern.charAt(j))
                {
                    count++;
                }
            }
            ans=ans+count;
            count=0;
       }
       System.out.println(ans);
       System.out.println(count);
       ArrayList<String>ar=new ArrayList<>();
       boolean a=true;
       for(int i=0;i<words.length;i++)
       {    
            for(int j=0;j<words[i].length();j++)
            {
                for(int k=0;k<words[i].length();k++)
                {
                    if(words[i].charAt(j)==words[i].charAt(k))
                    {
                        count++;
                    }
                }
                if(count!=Integer.parseInt(""+ans.charAt(j)))
                {
                    a=false;
                }
                count=0;
            }
            
            if(a)
            {
                ar.add(words[i]);
                if(!words[i].equals("yyxx"))
                {
                    ar.add(words[i]);
                }
            }
            else
            {
                a=true;
            }
            
       }
       System.out.println(ar);
    }
}

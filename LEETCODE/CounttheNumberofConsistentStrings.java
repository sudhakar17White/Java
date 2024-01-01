import java.util.Arrays;

public class CounttheNumberofConsistentStrings {
    public static void main(String[] args) {
        String allowed = "ab";
        String words[] = {"ad","bd","aaab","baa","badab"};
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words[i].length();j++)
            {
                for(int k=0;k<allowed.length();k++)
                {
                    words[i]=words[i].replace(allowed.charAt(k), '0');
                }
            }
        }
        boolean in=true;
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words[i].length();j++)
            {
                if(words[i].charAt(j)!='0')
                {
                    in=false;
                    break;
                }
                
            }
            if(in==true)
            {
                count++;
            }
            in=true;
            
        }
        System.out.println(count);
    }
}

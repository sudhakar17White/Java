public class FindWordsThatCanBeFormedbyCharacters {
    public static void main(String[] args) {
       String words[] = {"hello","world","leetcode"};
       String chars = "welldonehoneyr";
       String cpy=chars;
       int count=0;
       int tot=0;
       for(int i=0;i<words.length;i++)
       {
            for(int j=0;j<words[i].length();j++)
            {   a:
                for(int k=0;k<chars.length();k++)
                {
                    if(words[i].charAt(j)==chars.charAt(k))
                    {
                        chars=chars.replace(chars.charAt(k), '*');
                        tot++;
                        break a;
                    }
                }
                if(tot==words[i].length())
                {
                    System.out.println(chars);
                    count=count+tot;
                    tot=0;
                    chars=cpy;
                    break;
                }
               
                
            }
       }
       System.out.println(count);

    }
}

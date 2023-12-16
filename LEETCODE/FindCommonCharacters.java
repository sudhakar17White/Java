public class FindCommonCharacters {
    public static void main(String[] args) {
        String words[] = {"cool","lock","cook"};
        int ch=0;
        String ans="";
        for(int i=0;i<words[0].length();i++)
        {
            char a=words[0].charAt(i);
            
            for(int j=0;j<words.length;j++) {
                for(int k=0;k<words[j].length();k++)
                {
                    if(a==words[j].charAt(k))
                    {
                        ch++;
                    }
                }

            }
            if(ch==words.length||ch/2==words.length)
            {
                ans=ans+words[0].charAt(i);
                //System.out.println(ch);
            }
            
            ch=0;
            
        }
        System.out.println(ans);
    }
}

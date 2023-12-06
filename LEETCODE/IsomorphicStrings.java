public class IsomorphicStrings {
    static String check(String s)
    {
        String ans="";
        int an=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    an++;
                }
            }
            ans=ans+an;
            an=0;
        }

        return ans;
    }
    public static void main(String[] args) {
       String s = "bbbaaaba"; String t = "aaabbbba";
       boolean ans=false;
       System.out.println(check(s));
       System.out.println(check(t));
       if(check(s).equals(check(t)))
       {
            ans=true;
       }

    }
}

public class RansomNotes {
    public static void main(String[] args) {
        String ransomNote = "aab"; String magazine = "baa";
        int len=ransomNote.length();
        int tcount=0;
        boolean ans=false;
        int same=1;
        for (int i=1; i<ransomNote.length(); i++) {
            if(ransomNote.charAt(i)=='a')
            {
                same++;
            }
        }
        if(same==ransomNote.length())
        {
        for(int i=0;i<magazine.length();i++)
        {
            if(ransomNote.charAt(0)==magazine.charAt(i))
            {
                tcount++;
                if(tcount==ransomNote.length())
                {
                    ans=true;
                    break;
                }
            }   
           
        }
        System.out.println(ans);
    }
    else
    {
        System.out.println(ans);
    }

    }
}

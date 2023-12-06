public class CountingWordsWithaGivenPrefix {
    public static void main(String[] args) {
       String words[] = {"leetcode","win","loops","success"};String pref = "code";
       int in=0;
       for(int i=0;i<words.length;i++)
       {

            if(words[i].length()>=pref.length())
            {
                
                if(words[i].substring(0, pref.length()).equals(pref))
                {
                    in++;
                }
            }
       }
       System.out.println(in);
    }
}

public class WordBreak {
    public static void main(String[] args) {
       String s = "leetcode"; String wordDict[] = {"leet","code"};
       int in=0;
       for(int i=0;i<wordDict.length;i++) 
       {
            if(s.substring(in,wordDict[i].length()).equals(wordDict[i]))
            {
                in=i;
            }
       }
    }
}

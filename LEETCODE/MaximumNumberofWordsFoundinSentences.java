import java.util.Arrays;

public class MaximumNumberofWordsFoundinSentences {
    public static void main(String[] args) {
        String sentences[]={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int count[]=new int[sentences.length];
        for(int i=0;i<sentences.length;i++)
        {
            count[i]=sentences[i].split(" ").length;
        }
        Arrays.sort(count);
        System.out.println(count[sentences.length-1]);
    }
}

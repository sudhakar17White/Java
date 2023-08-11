package Sentence_similary;
import java.util.*;
public class SentenceSimilary {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word[]=s.nextLine().split(" ");
        String word2[]=s.nextLine().split(" ");
        int len=word2.length,ch=0;
        for(int i=0;i<word.length;i++)
        {
            for(int j=0;j<len;j++)
            {
                if(word[i].equals(word2[j]))
                {
                    ch++;
                    break;
                }
            }
        }
        System.out.print((ch==len)?"True":"flase");
    }   
}

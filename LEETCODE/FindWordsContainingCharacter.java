import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static void main(String[] args) {
        String words[] = {"abc","bcd","aaaa","cbc"}; 
        char x = 'a';
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
           if(words[i].contains(""+x))
           {
                li.add(i);
                
           } 
        }
        System.out.println(li);

    }
}

import java.util.Arrays;

public class CountCommonWordsWithOneOccurrence {
    public static void main(String[] args) {
        String words1[] = {"a","ab"}; 
        String words2[] = {"a","a","a","ab"};
        int t=0;
        int count[]=new int[words1.length];
        
        for(int i=0;i<words1.length;i++)
        {
            for(int j=0;j<words2.length;j++)
            {
                if(words1[i].equals(words2[j]))
                {
                    count[i]=count[i]+1;
                }
            }
        }
        
        for(int i=0;i<count.length;i++)
        {
            if(count[i]==1)
            {
                t=t+count[i];
            }
        }
        System.out.println(t);
    }
}

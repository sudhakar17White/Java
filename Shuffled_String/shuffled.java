package Shuffled_String;
import java.util.*;
public class shuffled {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();
        int index[]=new int[word.length()];
        for(int i=0;i<index.length;i++)
        {
            index[i]=s.nextInt();
        }
        for(int i=0;i<index.length;i++)
        {
            for(int j=0;j<index.length;j++)
            {
                if(i==index[j])
                {
                    System.out.print(word.charAt(j)+" ");
                }
        }
        }
    }
}

package sort_by_length;
import java.util.*;

public class sort_by_len_string {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();
        String spword[]=word.split(" ");
        int len[]=new int[spword.length];
        for(int i=0;i<spword.length;i++)
        {
            len[i]=spword[i].length();
        }
        Arrays.sort(len);
        System.out.println(Arrays.toString(len));

        //print with length of the string
        for(int i=0;i<len.length;i++)
        {
            for(int j=0;j<spword.length;j++)
            {
                if(len[i]==spword[j].length())
                {
                    System.out.print(spword[j]+" ");
                    break;
                }
            }
        }
       
        
    }
}
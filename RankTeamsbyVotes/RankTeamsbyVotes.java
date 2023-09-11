package RankTeamsbyVotes;
import java.util.*;
public class RankTeamsbyVotes {
    public static void main(String[] args) {
        String words[]={"ABC","ACB","ABC","ACB","CBA"};
        int count[]=new int[words[0].length()];
        int co=0;
        for(int i=0;i<count.length;i++)
        {
            char a=words[0].charAt(i);
            System.out.println(a);
            for(int j=0;j<words.length;j++)
            {
                for(int r=0;r<words[j].length();r++)
                {
                    if(a==words[j].charAt(r)&&i==r)
                    {
                        co++;
                        break;
                    }
                }

            }
            count[i]=co;
            co=0;
        }
        System.out.println(Arrays.toString(count));
    }
}

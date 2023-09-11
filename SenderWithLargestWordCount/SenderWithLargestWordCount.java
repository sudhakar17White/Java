package SenderWithLargestWordCount;
import java.util.*;
public class SenderWithLargestWordCount {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String sr = "**|**|***|";
        int len=s.nextInt();
        int quires[][]=new int[len][2];
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<2;j++)
            {
                quires[i][j]=s.nextInt();
            }
        }
        int count[]=new int[len];
        int fi=0;
        for(int i=0;i<len;i++)
        {
            int st=quires[i][0];
            int en=quires[i][1];
            if(fi==0||fi<en)
            {
            
            int co=0;
            for(int j=st;j<en;j++)
            {
                if(sr.charAt(j)=='*')
                {
                    co++;
                }
            }
            
            count[i]=co;
            fi=en;
            }
            else
            {
                count[i]=0;
            }
            
        }

        System.out.println(Arrays.toString(count));



    }
}

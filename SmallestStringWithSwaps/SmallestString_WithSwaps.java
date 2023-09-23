package SmallestStringWithSwaps;
import java.util.*;
public class SmallestString_WithSwaps {
    static String swap(String sr,int st,int en)
    {
        char ar[]=sr.toCharArray();
        char ch[]={ar[en],ar[st]};
        String arr="";
        int c=0;
        for(int i=0;i<ar.length;i++)
        {
            if(st==i||en==i)
            {
                arr=arr+ch[c];
                c++;
                
            }
            else
            {
                arr=arr+ar[i];
                
            }

        }
        
       
        System.out.println(arr);


        return arr;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String sr="dcab";
        int pairs[][]={{0,3},{0,2},{1,2}};
       // System.out.println(pairs.length);
        for(int i=0;i<pairs.length;i++)
        {
               System.out.println(pairs[i][0]+" "+pairs[i][1]);
               //swap
               sr=swap(sr, pairs[i][0], pairs[i][1]);
        }
        System.out.println(sr);

    }
}

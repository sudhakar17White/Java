package Decode_String;
import java.util.*;

public class  Decode_str{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();
        int op=0;
        int cl=0;
        int i,j;
        for(i=0;i<word.length();i++)
        {
            if(word.charAt(i)=='[')
            {   op=i;
                
                for(j=i+1;j<word.length();j++)
                {
                    if(word.charAt(j)==']')
                    {
                        cl=j;
                        break;
                    }
                }
                for(int k=0;k<Integer.parseInt(word.charAt(i-1)+"");k++)
                {
                    System.out.print(word.substring(op+1,cl)+"");
                }
            }
            
            
        }

    }
}

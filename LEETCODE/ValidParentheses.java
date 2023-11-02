import java.util.Arrays;
import java.util.HashMap;

public class ValidParentheses {
    public static void main(String[] args) {
        String ch="([)]";
        
        int sym[]=new int[6];
        for(int i=0;i<6;i++)
        {
            sym[i]=0;
        }
        for(int i=0;i<ch.length();i++)
        {
            
            if((""+ch.charAt(i)).equals("("))
            {
                
                sym[0]=sym[0]+1;
            }
            else if((""+ch.charAt(i)).equals("{"))
            {
                sym[1]=sym[1]+1;
                
            }
            else if((""+ch.charAt(i)).equals("["))
            {
                sym[2]=sym[2]+1;
               
            }
            else if((""+ch.charAt(i)).equals(")"))
            {
                sym[3]=sym[3]+1;
               
            }
            else if((""+ch.charAt(i)).equals("}"))
            {
                sym[4]=sym[4]+1;
               
            }
            else if((""+ch.charAt(i)).equals("]"))
            {
                sym[5]=sym[5]+1;
                
            }
            

        }
        int fs=0;
        int ls=3;
        int c=0;
        for(int i=0;i<sym.length/2;i++)
        {
            if(sym[fs]==sym[ls])
            {
                c++;
                fs++;
                ls++;
            }
        }
        
        System.out.println(c);
        if(c==0)
        {
            System.out.println("False");
        }
        else
        {
            System.out.println("True");
        }
    }
}

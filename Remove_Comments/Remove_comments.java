package Remove_Comments;
import java.util.*;
public class Remove_comments {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String source[]= {"/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c;", "/* This is a test", "   multiline  ", "   comment for ", "   testing */", "a = b + c;", "}"};
        // to remove /* */ and to remove //
        int nxt=0;
        System.out.println("Input Code:");
        for(int i=0;i<source.length;i++)
        {
            System.out.println(source[i]);
        }

        System.out.println("\nAfter Remove Commond:\n");
        for(int i=0;i<source.length;i++)
        {
           if(source[i].length()!=1&&source[i].substring(0, 2).equals("/*"))
           {    //System.out.println(source[i]);
                if((source[i].substring(source[i].length()-2, source[i].length()).equals("*/")))
                {
                 
                }
                else
                {
                  
                    int j;
                    for(j=i+1;j<source.length;j++)
                    {
                        if(source[j].length()!=1&&(source[j].substring(source[j].length()-2, source[j].length()).equals("*/")))
                        {
                          break;
                        }
                    }
                    i=0+j;

                }
                
           }
           else
           {

            String st=source[i].trim();
            
            if(source[i].length()>=2)
            {
                if(!((st.substring(0, 1)).equals("/")))
                {
                    System.out.println(source[i]);
                }
                
            }
            
           }
             
        }
         System.out.println(source[source.length-1]);
        
    }
}

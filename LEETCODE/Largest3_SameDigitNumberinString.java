import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Largest3_SameDigitNumberinString {
    public static void main(String[] args) {
        String num = "74444";
        ArrayList<String> ar=new ArrayList<String>();
        
        int in=1;
        String add="";
        for(int i=0;i<num.length();i++)
        {
            add=add+num.charAt(i);
            for(int j=i+1;j<num.length();j++)
            {
               if(num.charAt(i)==num.charAt(j))
               {
                add=add+num.charAt(j);
                in++;
               }
               else if(in==3)
                {
                    ar.add((add));
                    add="";
                    in=1;
                }
               else{
                    in=1;
                    break;
               }
            }
            if(in==3)
            {
                ar.add(add);
                in=1;
            }
            add="";

           
        }
         
         Collections.sort(ar);
         if(ar.size()==0)
         {
            System.out.println("*");
         }
         else
         {
            System.out.println(String.valueOf(ar.get(ar.size()-1)));
         }
    }
}

import java.util.ArrayList;
import java.util.List;

public class BaseBallGame {
    static String isnum(String ab)
    {
        return "";
    }

    public static void main(String[] args) {
       String ops []= {"5","2","C","D","+"};
       String ans="";
       String ar="";
       int tot=0;
       for(int i=0;i<ops.length;i++)
       {
            if(ops[i].equals("C"))
            {
                System.out.println(ar.length());
                ans=ar.substring(0,ar.length());
                System.out.println(ans);
            }
            else if(ops[i].equals("D"))
            {
                System.out.println(ar);
                ans=ans.substring(0,ans.length()-1)+(""+Integer.parseInt(""+ar.charAt(ar.length()-1))*Integer.parseInt(""+ar.charAt(ar.length()-2)));
                System.out.println(ans);
            }
            else if(ops[i].equals("+"))
            {
                if(i==ops.length)
                {
                    for(int j=0;j<ans.length();i++)
                    {
                        tot=tot+Integer.parseInt(""+ans.charAt(i));
                    }
                }
                else
                {
                    ans=ans+(""+Integer.parseInt(""+ar.charAt(ar.length()-1))+Integer.parseInt(""+ar.charAt(ar.length()-2)));
                    
                }
            }
            else if(Character.isDigit(ops[i].charAt(0)))
            {
                System.out.println(ops[i]);
                ar=ar+ops[i];
            }
       }
       System.out.println(tot);
        

    }
}
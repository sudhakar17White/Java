import java.util.*;
public class word_rev_swap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String input="This is a test input string";
        String ch="st";
        String reversed="";
        String add="";
        System.out.println(input);
        for(int i=input.length()-1;i>=0;i--)
        {
            
            if(input.charAt(i)==' '||i==0)
            {
                reversed=reversed+add+input.charAt(i);
                add="";
            }
            else
            {
                add=add+input.charAt(i);
            }
        }
        reversed=reversed+" ";
      // System.out.println(reversed);
        
        String revesofrev="";
       // System.out.println(reversed.length());
        int st=0;
        int en=0;
        for(int i=0;i<reversed.length();i++)
        {
            if(reversed.charAt(i)==' ')
            {
                en=i;
                for(int j=en;j>=st;j--)
                {
                    revesofrev=revesofrev+reversed.charAt(j);
                }
                st=en+1;
                
            }
        }
        revesofrev=revesofrev+" ";
        //System.out.println(revesofrev);
        //System.out.println(revesofrev.length());

        ArrayList <String> ar=new ArrayList<>();
        String de="";
        
        for(int i=1;i<revesofrev.length();i++)
        {
            if(revesofrev.charAt(i)==' '||i==0)
            {
                ar.add(de);
                de="";
            }
            else
            {
                de=de+revesofrev.charAt(i);
            }
        }
        //System.out.println(ar);

        //System.out.println(ch);
        int swo=0;
        int swt=0;

        for(int i=0;i<ar.size();i++)
        {
            if(ar.get(i).charAt(0)==ch.charAt(0))
            {
                swo=i;
            }
        }
        for(int i=0;i<ar.size();i++)
        {
            if(ar.get(i).charAt(0)==ch.charAt(1))
            {
                swt=i;
            }
        }
       // System.out.println(swo+" "+swt);

        String change=ar.get(swt);
        ar.set(swt, ar.get(swo));
        ar.set(swo, change);
        //System.out.println(ar);

        for(int i=ar.size()-1;i>=0;i--)
        {
            System.out.print(ar.get(i)+" ");
        }
        
    }
}

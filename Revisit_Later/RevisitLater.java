import java.util.*;
class RevisitLater{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word=s.nextLine().toLowerCase();
        int vowelcount=0;
        String ans="";
        //Boolean vol[]=new Boolean[5];
        int in=0;
        for(int i=0;i<word.length();i++)
        {
            if((word.charAt(i)!='a'&&word.charAt(i)!='e'&&word.charAt(i)!='i'&&word.charAt(i)!='o'&&word.charAt(i)!='u'))
            {
                ans=ans+word.charAt(i);
            }
            else
            {
                vowelcount++;
            }
        }
        if(vowelcount==5)
        {
            System.out.println(ans.toUpperCase()+":"+ans.length());
        }
        else
        {
            StringBuilder str=new StringBuilder(word);
            System.out.println(str.reverse().toString().toUpperCase()+":ERROR");
        }
    }
}
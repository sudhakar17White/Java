import java.util.ArrayList;

public class CheckifaStringIsanAcronymofWords {
    public static void main(String[] args) {
        String ar[]={"alice","bob","charlie"};
        ArrayList<String> ls=new ArrayList<>();
        ls.add("alice");
        ls.add("bob");
        ls.add("charlie");
        String s="abc";

        String ans="";
        for(int i=0;i<ls.size();i++)
        {
            ans=ans+ls.get(i).charAt(0);
        }
        if(s.equals(ans))
        {
            System.out.println("true");
        }
    }
}

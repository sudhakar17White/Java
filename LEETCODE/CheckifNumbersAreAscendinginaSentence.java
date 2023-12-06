import java.util.ArrayList;
import java.util.Collections;

public class CheckifNumbersAreAscendinginaSentence {
    public static void main(String[] args) {
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        String an[]=s.split(" ");
        ArrayList<Integer> in=new ArrayList<>();
        int max=0;
        a:
        for(int i=0;i<an.length;i++)
        {
            if(!Character.isAlphabetic(an[i].charAt(0)))
            {
                in.add(Integer.parseInt(an[i]));
            }
        }
        boolean ans=true;
        for(int i=0;i<in.size();i++)
        {
             if(max<in.get(i))
             {
                max=in.get(i);
             }
             else
             {
                ans=false;
                break;
             }
        }
        System.out.println(ans);
       

    }
}

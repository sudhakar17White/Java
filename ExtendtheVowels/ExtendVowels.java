package ExtendtheVowels;
import java.util.*;
public class ExtendVowels {
    static void extendvowels(String word,int row)
    {
        for(int i=0;i<word.length();i++)
        {
            if((""+word.charAt(i)).equalsIgnoreCase("a")||(""+word.charAt(i)).equalsIgnoreCase("e")||(""+word.charAt(i)).equalsIgnoreCase("i")||(""+word.charAt(i)).equalsIgnoreCase("o")||(""+word.charAt(i)).equalsIgnoreCase("u"))
            {
                for(int j=0;j<row;j++)
                {
                    System.out.print(word.charAt(i));
                }
            }
            else
            {
                System.out.print(word.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();
        int row=s.nextInt();
        extendvowels(word,row);

    }
}

package changeCharToNextChar;
import java.util.*;
public class chartoNext {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();
        String next="";
        for(int i=0;i<word.length();i++)
        {
            System.out.print((char)((int)word.charAt(i)+1));
        }

    }
}

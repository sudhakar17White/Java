package Roate_String;
import java.util.*;

public class roate_string {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();
        String goal=s.nextLine();
        int flag=0;
        for(int i=0;i<word.length();i++)
        {
            char a=word.charAt(0);
            word=word.substring(1, word.length());
            word=word+a;
            if(word.equals(goal))
            {
                flag=1;
                break;
            } 
        }
        System.out.println((flag==1)?"True":"False");
    }
}

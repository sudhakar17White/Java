package Anogram;
import java.util.*;
public class anogram {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String fi=s.nextLine();
        String se=s.nextLine();
        char f[]=fi.toCharArray();
        char sc[]=se.toCharArray();
        Arrays.sort(f);
        Arrays.sort(sc);
        boolean res=Arrays.equals(f, sc);
        if(res)
        {
            System.out.println("anogrom");
        }
        else
        {
            System.out.println("Not anogram");
        }
       
    }
}

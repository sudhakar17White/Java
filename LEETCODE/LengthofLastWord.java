import java.util.*;
public class LengthofLastWord {
    public static void main(String[] args) {
        
        String s="   fly me   to   the moon  ".trim();
        String ls[]=s.split(" ");
        System.out.println(ls[ls.length-1].length());
    }
}

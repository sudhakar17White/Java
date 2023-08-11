package Word_subSet;
import java.util.*;
import java.util.regex.Pattern;
public class word_sub {
    public static void main(String[] args) {
       String words1[] = {"amazon","apple","facebook","google","leetcode"};
       System.out.print("[");
       for(String wr:words1)
       {
           System.out.print( (Pattern.matches(".*[e].*", wr)&&Pattern.matches(".*[o].*", wr))?'"'+wr+'"':"");
       }
       System.out.print("]");
    }
}

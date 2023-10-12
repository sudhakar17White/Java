package Functioninator8000;
import java.util.*;
public class Functioninator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();
        System.out.println(((word.charAt(word.length()-1))=='a'||(word.charAt(word.length()-1))=='e'||(word.charAt(word.length()-1))=='i'||(word.charAt(word.length()-1))=='o'||(word.charAt(word.length()-1))=='u')?(word+"-inator "+word.length()+"000"):(word+"inator "+word.length()+"000"));   
    }
}

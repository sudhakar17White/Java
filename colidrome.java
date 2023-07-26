import java.util.*;
class colidrome
{
    static void colidrome(String word)
    {
        String fi=word.substring(0,word.length()/2);
        String se=word.substring(word.length()/2, word.length());
        se=new StringBuilder(se).reverse().toString();
        System.out.println((fi.equals(se))?"Colidrome":"Not Colidrome");

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        colidrome(s.nextLine());
    }
}

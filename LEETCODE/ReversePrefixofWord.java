public class ReversePrefixofWord {
    public static void main(String[] args) {
       String word = "abcdefd";char ch = 'd';
       int in=word.indexOf(ch);
       StringBuilder str=new StringBuilder(word.substring(0, in+1));
       String ans=str.reverse()+word.substring(in+1,word.length());
       System.out.println(ans);
    }
}

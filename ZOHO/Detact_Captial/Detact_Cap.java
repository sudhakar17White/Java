package Detact_Captial;

public class Detact_Cap {
    static boolean upper(String wr)
    {
        int ch=0;
        for(int i=0;i<wr.length();i++)
        {
            if((int)wr.charAt(i)>=65&&(int)wr.charAt(i)<=95)
            {
                ch++;
            }
        }
        if(ch==wr.length())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        String word="g";
        System.out.println(upper(word));
    }
}

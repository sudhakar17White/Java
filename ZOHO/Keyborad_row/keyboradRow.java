package Keyborad_row;
import java.util.*;
public class keyboradRow {
    static String set1(String wr)
    {
        String st="qwertyuiop";
        int ch=0;
        for(int i=0;i<wr.length();i++)
        {
            for(int j=0;j<st.length();j++)
            {
                if(wr.charAt(i)==st.charAt(j))
                {
                   ch++;
                   
                }
            }
        }
        //System.out.println(ch);
        if(ch==wr.length())
        {
            return wr;
        }
        else
        {

            return " ";
        }
        
    }
    static String set2(String wr)
    {
        String st="asdfghjkl";
        int ch=0;
        for(int i=0;i<wr.length();i++)
        {
            for(int j=0;j<st.length();j++)
            {
                if(wr.charAt(i)==st.charAt(j))
                {
                   ch++; 
                   
                }
            }
        }
       // System.out.println(ch+" "+wr);
        if(ch==wr.length())
        {
            return wr;
        }
        else
        {

            return " ";
        }
        
    }
    static String set3(String wr)
    {
        String st="zxcvbnm";
        int ch=0;
        for(int i=0;i<wr.length();i++)
        {
            for(int j=0;j<st.length();j++)
            {
                if(wr.charAt(i)==st.charAt(j))
                {
                   ch++; 
                   
                }
            }
        }
       // System.out.println(ch+" "+wr);
        if(ch==wr.length())
        {
            return wr;
        }
        else
        {

            return " ";
        }
        
    }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String words[] = {"mlpk","Abji","omk","aeds"};
        
        for(int i=0;i<words.length;i++)
        {
            if(set1(words[i].toLowerCase()).equals(words[i].toLowerCase()))
            {
                System.out.print(words[i]+" ");
            }
            else if(set2(words[i].toLowerCase()).equals(words[i].toLowerCase()))
            {
                System.out.print(words[i]+" ");
            }
            else if(set3(words[i].toLowerCase()).equals(words[i].toLowerCase()))
            {
                System.out.print(words[i]+" ");
            }
            
        }

    }
}

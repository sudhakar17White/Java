package Decoded_String_Index;
import java.lang.reflect.Array;
import java.util.*;
public class DecodedStringIndex {
    static String serach(int sh,String s)
    {
        int in=0;
        for(int i=0;i<s.length();i++)
        {
            if((i+1)==sh)
            {
                return (""+s.charAt(i));
            }
        }

        return "";
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String input=s.nextLine();
        int Indexserach=s.nextInt();
        int st=0;
        String output="";
        ArrayList<Integer> ar=new ArrayList<>();
        ArrayList<String> br=new ArrayList<>();
        int co=0;
        br:
        if(Character.isDigit(input.charAt(input.length()-1))==Character.isDigit(input.charAt(input.length()-2)))
        {

        
        for(int i=0;i<input.length();i++)
        {   
            if(Character.isDigit(input.charAt(i)))
            {
               // System.out.println(Integer.parseInt(""+input.charAt(i)));
                ar.add(Integer.parseInt(""+input.charAt(i)));
                br.add(""+input.replace(input.charAt(i), ' '));
                
            }     
        }
       
        for(int i=0;i<ar.size();i++)
        {
            for(int j=0;j<ar.get(i);j++)
            {
                output=output+(br.get(i).trim());
            }
        }
            
        }
        else
        {
            for(int i=0;i<input.length();i++)
            {
                if(Character.isDigit(input.charAt(i)))
                {
                    int re=Integer.parseInt(""+input.charAt(  i));
                    String sub=input.substring(st, i);
                    for(int j=0;j<re;j++)
                    {
                        output=output+sub;
                    }
                    st=i+1;
                }
            }
        }
        
        System.out.println(serach(Indexserach, output));


    }
        
    }


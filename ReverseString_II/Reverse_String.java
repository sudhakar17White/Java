package ReverseString_II;

import java.util.Arrays;

class Reverse_String{
    public static void main(String args[])
    {
        // String word="abcd";
        // int k=2;
        // if(word.length()<=2*k)
        // {
        //     char fi=word.charAt(0);
        // }
        char s[] = {'h','e','l','l','o'};
        
        int right=0;
        int left=s.length-1;
        for(int i=0;i<s.length/2;i++)
        {
            //res[in]="\""+s[i]+"\"";
            char a=s[right];
            s[right]=s[left];
            s[left]=a;
            right++;
            left--;
           
        }
        int in=0;
        System.out.print("[");
        for(int i=0;i<s.length;i++)
        {
            if(in==s.length-1)
            {
                System.out.print("\""+s[i]+"\"");
            
            }
            else
            {

                System.out.print("\""+s[i]+"\",");
            }
            in++;
        }
        System.out.print("]");
        
        
    }
}
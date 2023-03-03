/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author sudhakar
 */
public class swap_first_last_vowel {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        Scanner s=new Scanner(System.in);
        
        String word=s.nextLine();
        
        int size=word.length();
        
        String cpy=""+word;
        int st=0;
        char f;
        for(int i=0;i<size;i++)
        { 
        
            char a=word.charAt(i);
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
            { 
            
                st=i;
                f=a;
                break;
            }
        
        }
        //System.out.println(st);
        
        StringBuilder res=new StringBuilder(cpy);
        res.reverse();
       // System.out.println(res);
        int en=0;
        char l = 0;
         for(int i=0;i<size;i++)
        { 
        
            char a=res.charAt(i);
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
            { 
            
                en=i;
                l=a;
                break;
            }
        
        }
       
        //System.out.println(en);
        
        int last=(size-en)-1;
        //System.out.println(last+""+l);
        
        char ar[]=word.toCharArray();
        
        char temp=ar[st]; //a
        
        ar[st]=ar[last];
        ar[last]=temp;
        
        for(int i=0;i<size;i++)
        { 
        
            System.out.print(ar[i]+"");
        
        }
        
    }
}
//approximately

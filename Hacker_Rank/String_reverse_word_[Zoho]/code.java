/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package hackerrank;

/**
 *
 * @author sudhakar
 */
import java.util.*;

public class Reverse_word {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        
        String words=s.nextLine()+" ";
        
        String w[]=words.split(" ");
        int len=w.length;
        String word[] =new String[len];
        String ans="";
        int ad=0;
        
        
        for(int i=0;i<words.length();i++)
        { 
        
            
            if(words.charAt(i)==' ')
            { 
                word[ad]=ans;
                ad++;
                ans="";
            }
            else
            {
                ans=ans+words.charAt(i);
            }
        }
        System.out.println(Arrays.toString(word));
        for(int i=word.length-1;i>=0;i--)
        { 
            System.out.print(word[i]+" ");
        
        }
       
        
    }
}

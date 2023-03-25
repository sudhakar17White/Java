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
public class Char_B_follows_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();
        char a=s.next().charAt(0);
        char b=s.next().charAt(0);
        int len=word.length();
        int count=0;
        for(int i=0;i<word.length();i++)
        { 
            if(word.charAt(i)==a)
            {   
                if(i<(len-1))
                {
                    if(word.charAt(i+1)==b)
                    { 
                        count++;
                
                    }
                }
            
           }
        
        }
        System.out.println(count);
        
    }
}

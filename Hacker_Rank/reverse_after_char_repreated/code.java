/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package notes;

import java.util.Scanner;

/**
 *
 * @author sudhakar
 */
public class Reverse_after_char {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        Scanner s=new Scanner(System.in);
        
        String word=s.nextLine();
        
        char first=word.charAt(0);
        String fi="";
        String res="";
        
        for(int i=1;i<word.length();i++)
        {     
            char b=word.charAt(i);
            int comp=Character.compare(first, b);
            if(comp==0)
            { 
                fi=word.substring(0,i);
                res=word.substring(i+1, word.length());
                break;
            }
        
        }
        
        StringBuilder sb = new StringBuilder(res);
        
        sb.reverse();
        
        System.out.println(fi+sb);
    }
}

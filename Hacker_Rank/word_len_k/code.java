/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sudhakar
 */
public class word_leng_k {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        Scanner s=new Scanner(System.in);
        
        String word=s.nextLine();
        
        int size=word.length();
        
        int k=s.nextInt();
        
        String cpy[]=word.split(" ");
        
        //System.out.println(Arrays.toString(cpy));
        
        for(int i=0;i<cpy.length;i++)
        { 
        
            if(cpy[i].length()>=k)
            {
            
                System.out.print(cpy[i]+" ");
                
            }
        
        }
       
        
        
    }
}

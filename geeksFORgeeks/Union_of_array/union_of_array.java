/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package geeksforgeeks;

import java.util.Scanner;

/**
 *
 * @author sudhakar
 */
public class Union_of_array {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String args[]) {
        // TODO code application logic here
        
        Scanner s=new Scanner(System.in);
        
        int s1=s.nextInt();
        int s2=s.nextInt();
        
        int ar1[]=new int[s1];
        int ar2[]=new int[s2];
        
       for(int i=0;i<s1;i++)
       { 
           ar1[i]=s.nextInt();
       
       }
       
       for(int i=0;i<s2;i++)
       { 
           ar2[i]=s.nextInt();
       
       }
       
       int count=0;
       
       for(int i=0;i<s2;i++)
       { 
       
           for(int j=0;j<s1;j++)
           { 
           
               if(ar2[i]==ar1[i])
               { 
                   count--;
                   
               
               }
               count++;
           
           }
       
       }
       if(count==0)
       { 
            System.out.println(s1);
       
       }
       else
       {
        System.out.println(count+1);
       }
       
    }
}

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
public class Jhon_pair {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        
        int ar[]=new int[size];
        
        for(int i=0;i<size;i++)
        {
        
            ar[i]=s.nextInt();
        
        }
        
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        int odd=1;
        int even=0;
        int pair=1;
        for(int i=0;i<ar.length-1;i++)
        { 
            
            
            if(ar[i]==ar[i+1])
            { 
                pair++;
            
            }
     
        }
        System.out.println(pair/2);
        
        
    }
}

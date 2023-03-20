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
public class Minimum_number_of_jump {

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
        int steps=0;
        for(int i=0;i<ar.length;i++)
        { 
            size=size-ar[i];
            
            if(size<0)
            { 
                break;
            
            }
            steps++;
            
        }
        System.out.println(steps);
    }
}

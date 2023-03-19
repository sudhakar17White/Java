/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package geeksforgeeks;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sudhakar
 */
public class Wave_array {

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
        
        int len=size/2;
        int i=0,j=1;
        while(len!=0)
        { 
            int temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
            
            i+=2;
            j+=2;
            len--;
        
        }
        System.out.println("Wave Array:"+Arrays.toString(ar));
        
    }
}

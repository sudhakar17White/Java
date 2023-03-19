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
public class Partioal_equal_subset_sum {

    static int maxmimum(int ar[])
    { 
        int max=ar[0];
        int index=0;
        for(int i=1;i<ar.length;i++)
        { 
            if(max<ar[i])
            {
                max=ar[i];
                index=i;
            }
        }
        ar[index]=0;
        return max;
    }
    public static void main(String args[]) {
        
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int ar[]=new int[size];
        
        for(int i=0;i<size;i++)
        { 
            ar[i]=s.nextInt();
        }
        
        int max=maxmimum(ar);
        
        if(max>=10)
        {
            
            int sum=0;
            for(int i=0;i<size;i++)
            {
                sum+=ar[i];
            }
            if(sum==max)
            { 
                System.out.println("Yes");
            
            }
            else
            {
            
                System.out.println("No");
            
            }
            
        }
        else
        { 
        
            System.out.println("No");
        
        }
        
    }
}

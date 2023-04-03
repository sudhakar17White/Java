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
class algorthim
{
    Scanner s=new Scanner(System.in);
    int algo(int size)
    {
        int ar[]=new int[size];
    
        int pos=0,neg=0;
        
        for(int i=0;i<size;i++)
        { 
            ar[i]=s.nextInt();
        }
        
        for(int i=0;i<size;i++)
        {
        
            if(ar[i]>=0)
            {
                pos=pos+ar[i];
            }
            else
            { 
                neg=neg-ar[i];
            }
        
        }
        int ans=0;
        if(pos==0)
        {
        
            
            return -1;
            
        }
        else
        {
            ans=pos-neg;
        }
        
        return ans;
    }



}
public class Kadane_Algorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner s=new Scanner(System.in);
        
        int size=s.nextInt();
        
        algorthim ag=new algorthim();
        
        System.out.println(ag.algo(size));
        
    }
}

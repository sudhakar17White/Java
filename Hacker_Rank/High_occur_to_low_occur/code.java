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
    


public class High_occur_to_low_occur {

    /**
     * @param args the command line arguments
     */
    static void max(int oc[])
    { 
        int size=oc.length;
        
        int max=oc[0];
        int l=0;
        int count=0;
        for(int i=0;i<size;i++)
        { 
            if(oc[i]==0)
            { 
            
                count++;
                
            }
        
        }
        for(int i=0;i<size;i++)
        {
               
            if(max<oc[i])
            {
                max=oc[i];
                l=i;
            }
        }
        if(l!=0)
        {
            System.out.print(l+" ");
        }
        oc[l]=0;
        
        
        
    }
    
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        
        int ar[]=new int[size];
        
        for(int i=0;i<size;i++)
        {
            ar[i]=s.nextInt();
        }
        int max=ar[0];
        for(int i=1;i<size;i++)
        { 
            if(max<ar[i])
            { 
                max=ar[i];
            
            }
        
        }
        //System.out.println(max);
        int oc[]=new int[max+1];
        for(int i=0;i<max;i++)
        {
            oc[i]=0;
        
        }
        
        for(int i=0;i<size;i++)
        { 
            oc[ar[i]]=oc[ar[i]]+1;
        
        }
        //System.out.println(Arrays.toString(oc));
        
        
        for(int i=0;i<size;i++)
        { 
            max(oc);
        }
        
        
    }
}

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
public class Majoritiy_Element {

    /**
     * @param args the command line arguments
     */
    static int maxmium(int ar[])
    { 
        int max=ar[0];
        for(int i=0;i<ar.length;i++)
        { 
        
            if(max<ar[i])
            { 
                max=ar[i];
                
            }
        
        }
    
        return max;
    }
     static int maxmiumindex(int ar[])
    { 
        int max=ar[0];
        int index=0;
        for(int i=0;i<ar.length;i++)
        { 
        
            if(max<ar[i])
            { 
                max=ar[i];
                index=i;
            }
        
        }
    
        return index;
    }
    static int check(int hash[])
    { 
        int check=0;
    
        for(int i=0;i<hash.length;i++)
        { 
            if(hash[i]==0||hash[i]==1)
            {
                check++;
            
            }
        
        }
        if(check==hash.length)
        { 
            check=0;
        
        }
        
        return check;
    }
    public static void main(String args[]) {
        // TODO code application logic here
        
        //hashing technique to slove
        Scanner s=new Scanner(System.in);
        
        int size=s.nextInt();
        
        int ar[]=new int[size];
        for(int i=0;i<size;i++)
        { 
            ar[i]=s.nextInt();
            
        }
        
        int max=maxmium(ar);
        //System.out.println(max);
        int hash[]=new int[max+1];
        
        for(int i=0;i<hash.length;i++)
        { 
            hash[i]=0;
        
        }
        
        for(int i=0;i<ar.length;i++)
        { 
            //System.out.println(ar[i]);
            hash[ar[i]]=hash[ar[i]]+1;
        
        }
        
        //System.out.println(Arrays.toString(hash));
        if(check(hash)==0)
        { 
            System.out.println("-1");
        
        }
        else
        { 
            
        
             int maxi=maxmiumindex(hash);
             System.out.println("majority element:"+maxi);
        
        
        }
        
    }
}

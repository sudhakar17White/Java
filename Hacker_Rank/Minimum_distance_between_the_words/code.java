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
public class Minimum_distance_between_word {

    /**
     * @param args the command line arguments
     */
    static int mins(int a,int b)
    { 
        int tot;
    
        if(a>b)
        { 
            tot=a-b;
        
        }
        else
        { 
        
            tot=b-a;
        }
    
        return tot;
        
    }
    
    
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        String words=s.nextLine();
        String word[]=words.split(" ");
        System.out.println(Arrays.toString(word));
        String st=s.nextLine();
        String en=s.nextLine();
        int sco=0;
        int eco=0;
        
        for(int i=0;i<word.length;i++)
        { 
        
            if(st.equals(word[i]))
            { 
                sco=i;
                break;
            }
        
        }
            
            
        for(int i=0;i<word.length;i++)
        { 
        
            if(en.equals(word[i]))
            { 
                  eco=i;
                  break;
                
            }   
        } 
        //System.out.println(sco+" "+eco);
        
        int scom=0,ecom=0;
          for(int i=word.length-1;i>0;i--)
        { 
        
            if(st.equals(word[i]))
            { 
                scom=i;
                break;
            }
        
        }
            
            
        for(int i=word.length-1;i>0;i--)
        { 
        
            if(en.equals(word[i]))
            { 
                  ecom=i;
                  break;
                
            }   
        } 
        
         //System.out.println(scom+" "+ecom);
         int tot1=mins(sco,eco);
         int tot2=mins(scom,ecom);
         
         //System.out.println(tot1+" "+tot2);
         
         if(tot1>tot2)
         { 
             System.out.println(tot2);
         
         }
        
    }
}
//the brown quick frog quick the

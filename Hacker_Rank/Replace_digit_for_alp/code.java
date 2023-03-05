/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author sudhakar
 */
public class Replace_digits_alpbhet {

    /**
     * @param args the command line arguments
     */
    //H
//75391
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        
        String as=s.next();
        s.nextLine();
        String alp="abcdefghijklmnopq";
        
        int chk=0;
        if(Character.isUpperCase(as.charAt(0)))
        { 
        
            chk=1;
            as= as.toLowerCase();
            //System.out.println(as);
        }
        
        
        String number=s.nextLine();
        char a=as.charAt(0);
        String ans="";
        int st=0;
        int f=0;
        for(int i=0;i<alp.length();i++)
        { 
        
            char ch=alp.charAt(i);
            int com=Character.compare(a, ch);
            if(com==0)
            { 
           
                f=1;
                st=i;
                break;
                
            }
        
        
        }
        
        if(f==1)
        {
            for(int j=0;j<number.length();j++)
            { 
               
                int ar=Character.getNumericValue(number.charAt(j));
                ar=ar+st;
                for(int k=0;k<alp.length();k++)
                {
                    
                    if(ar==k)
                    { 
                        ans=ans+alp.charAt(k);
                              
                    }
                    
                }
               
            }
            if(chk==1)
            { 
            
                System.out.println(ans.toUpperCase());
            
            }
            else
            {
                System.out.println(ans);
            }
        }
        else
        { 
            
            for(int j=0;j<number.length();j++)
            { 
                
                int ar=Character.getNumericValue(number.charAt(j));
                for(int k=0;k<alp.length();k++)
                {
                    
                    if(ar==k)
                    { 
                        ans=ans+alp.charAt(k-1);
                       
                    }
                    
                }
               
          
        
            }
            System.out.println(ans);
        
        
        
        }
            
    
        
    }
}

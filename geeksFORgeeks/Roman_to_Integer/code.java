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
public class Roman_to_Integer {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        String values=s.nextLine();
        String sym[]={"|","V","X","L","C","D","M"};
        String num[]={"1","5","10","50","100","500","1000"};
        
        int ans=0;
        for(int i=0;i<values.length();i++)
        { 
            String a=""+values.charAt(i);
            for(int j=0;j<sym.length;j++)
            { 
                if(a.equals(sym[j]))
                { 
                    int d=Integer.parseInt(num[j]);
                    ans=ans+d;
                
                }
            
            }
        
        }
        System.out.println(ans);
    }
}

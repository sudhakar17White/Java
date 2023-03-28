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
public class Next_Number_palindrome {

    static int digit(int di)
    { 
        int co=0;
        while(di!=0)
        { 
            co++;
            di=di/10;
        
        }
    
        return co;
    }
    static int palindrome(int num)
    {
        int di=digit(num);
        int res=0;
        for(int i=0;i<di;i++)
        { 
            int a=num%10;
            res=(res*10)+a;
            num=num/10;
        
        }
        return res;
    }
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        
        for(int i=num+1;i<100000;i++)
        { 
               int n=palindrome(i);
               if(n==i)
               { 
                   System.out.println(i);
                   break;
               }
        
        }
        
    }
}

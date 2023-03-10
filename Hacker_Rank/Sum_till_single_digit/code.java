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
public class Sum_till_single_digit {

    /**
     * @param args the command line arguments
     */
    static int sumdigit(int num)
    { 
        int sum=0;
    
        while(num!=0)
        { 
        
            int a=num%10;
            sum=sum+a;
            num=num/10;
        
        }
        
        
        return sum;
    
    }
    
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        
        for(int i=0;i<3;i++)
        {
            int di=sumdigit(num);
            num=di;
        }
        System.out.println(num);
    }
}

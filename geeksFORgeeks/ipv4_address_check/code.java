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
public class Ipv4_Address_check {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        
        String ip=s.nextLine();
        String value[]=ip.split(":");
        //System.out.println(Arrays.toString(value));
        if(value.length!=4)
        { 
            System.out.println("0");
        
        }
        else
        {   int flag=0;
            for(int i=0;i<value.length;i++)
            { 
                int com=Integer.parseInt(value[i]);
                if(com>=0&&com<=255)
                { 
                    flag=1;
                }
                else
                {   
                    flag=0;
                    break;
                
                }
            }
            if(flag==1)
            { 
                System.out.println("1");
            
            }
            else
            { 
                System.out.println("0");
            
            }
            
        }
    }
}

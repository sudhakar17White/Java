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
public class Odd_length_diagonal {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        
        String word=s.nextLine();
        
        int size=word.length();
        
        String box[][]=new String[size][size];
        
        for(int i=0;i<size;i++)
        { 
            char a=word.charAt(i);
            for(int j=0;j<size;j++)
            { 
            
                if(i==j)
                { 
                    box[i][j]=String.valueOf(a);
                
                }
                else
                { 
                
                    box[i][j]=" ";
                
                }
            
            }
        
        }
        
        int row=0;
        int col=size-1;
        StringBuilder str=new StringBuilder(word);
        str.reverse();

//        String str=" ";
//        
//        for(int i=size-1;i>0;i--)
//        { 
//            char a=word.charAt(i);
//            System.out.println(a);
//            str=str+a;
//        
//        
//        }


        for(int i=0;i<size;i++)
        { 
        
            char a=str.charAt(i);
               
            box[row][col]=String.valueOf(a);
               
            row++;
            col--;
        
        }
        
        
        
        
        
        for(int i=0;i<size;i++)
        { 
            for(int j=0;j<size;j++)
            { 
            
                    System.out.print(box[i][j]);
                
                
            }
            System.out.println("");
        
        }
        
        
        
    }
}

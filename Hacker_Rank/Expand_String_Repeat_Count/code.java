/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package hackerrank;

/**
 *
 * @author sudhakar
 */
import java.util.*;

public class Expand_repeat_count {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();
        
        String num[]=word.split("[a-z]+");
        String wor[]=word.split("[0-9]+");
        
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(wor));
        
        String ans="";
        int in=1;
        for(int i=0;i<num.length;i++)
        { 
            int st=Integer.parseInt(num[i]);
            String add=wor[in];
            for(int j=1;j<=st;j++)
            { 
                
                ans=ans+add;
            
            }
            in++;
        }
        
        System.out.println(ans);
        
    }
}

package Gruop_3;

import java.util.*;
public class Main {

    public static void main(String[] args) {
     
            Scanner s=new Scanner(System.in);
            String word=s.nextLine();
            int add=word.length()-((word.length()/3)*3);
           
            while(add!=1)
            {
                word="0"+word;
                add--;
            }
            System.out.println(word);
            int a=0;
            int b=3;
            for(int i=0;i<word.length()/3;i++)
            {
                 System.out.print(Integer.parseInt(word.substring(a,b),2));
                 a=b;
                 b=b+3;
            }
  
    }
   
}
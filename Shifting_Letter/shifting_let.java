package Shifting_Letter;
import java.util.*;

public class shifting_let {
    
    public static void main(String[] args) {
        String word="bad";
        int shifts[]={10,20,30};
        String add="";
        int sum=0;
        for(int i=0;i<word.length();i++)
        {
            for(int j=i;j<shifts.length;j++)
            {
                sum=sum+shifts[j];
            }
           
            add=add+((char)(((int)word.charAt(i))+sum));       

            sum=0;
        }
        System.out.println(add);

    }   
}

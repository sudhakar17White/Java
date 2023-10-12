package Expand_NumberI;
import java.util.*;
public class ExpandNumber {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String number=s.nextLine();
        String ans="";
        int di=1;
        String zero="";
        for(int i=number.length()-1;i>=0;i--)
        {

            if(di>1)
            {

                zero=zero+"0";
                if(number.charAt(i)=='0')
                {
                    ans=ans+number.charAt(i-1)+number.charAt(i)+zero;
                    break;
                }
                ans=ans+number.charAt(i)+zero+"/";
                di++;
            }
            else
            {
                ans=ans+number.charAt(i)+"/";
                di++;
            }
        }
        String ar[]=ans.split("/");
        for(int i=ar.length-1;i>=0;i--)
        {
            if(i==0)
            {
                System.out.print(ar[i]);
            }
            else
            {
                System.out.print(ar[i]+"+");
            }
        }
        //System.out.println(ans);
    }
}

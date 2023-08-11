package String_agustic_value;
import java.util.*;
public class agustic_number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String num=s.nextLine();
        int sum=0,add=0;
        for(int i=1;i<=num.length()-1;i++)
        {
            sum=sum+(Integer.parseInt(num.substring(0,i))+Integer.parseInt(num.substring(i, num.length())));  
            add=add+Integer.parseInt(""+num.charAt(i));
        }
        System.out.println(sum+Integer.parseInt(num)+add+Integer.parseInt(""+num.charAt(0)));
    }
}

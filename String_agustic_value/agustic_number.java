package String_agustic_value;
import java.util.*;
public class agustic_number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String num=s.nextLine();
        int sum=Integer.parseInt(num.substring(0,1))+Integer.parseInt(num.substring(1,num.length()));
        sum=(Integer.parseInt(num))+sum+(Integer.parseInt(num.substring(0,2))+Integer.parseInt(num.substring(2,num.length())));
        for(int i=0;i<num.length();i++)
        {
            sum=sum+Integer.parseInt(""+num.charAt(i));
        }
        System.out.println(sum);
    }
}

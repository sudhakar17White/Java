package DIvisablilty_of_arr;
import java.util.*;

public class Div_of_arr {
    static void Divarr(String word,int m)
    {
        String add="";
        int in=0;
        int ar[]=new int[word.length()];
        for(int i=0;i<word.length();i++)
        {
            add=add+word.charAt(i);
            if((Integer.parseInt(add))%m==0)
            {
                ar[in]=1;
                in++;
            }
            else
            {
                ar[in]=0;
                in++;
            }
        }
        System.out.println(Arrays.toString(ar));
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Divarr(s.nextLine(),s.nextInt());
    }
}

package Apply_discount_price;
import java.util.*;
public class discuont_price {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();
        String ar[]=word.split(" ");
        System.out.println(Arrays.toString(ar));
        int discount=s.nextInt();
        String di="0."+(discount%100);
        for(int i=0;i<ar.length;i++)
        {
            
            System.out.print(ar[i].charAt(0)=='$'&&(Integer.parseInt(""+ar[i].charAt(1)))<=9&&ar[i].charAt(ar[i].length()-1)!='$'? "$"+(new Float(di)*(new Float(""+ar[i].charAt(1))))+"0 ":ar[i]+" ");
            
        }

    }
}

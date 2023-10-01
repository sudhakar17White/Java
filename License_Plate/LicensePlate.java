package License_Plate;

import java.util.*;
public class LicensePlate {
    static String LetterAdd(String plate)
    {
        String[] a=plate.split("-");
        String str="";
        for(int i=0;i<a.length;i++)
        {
            str=str+a[i];
        }

        return str.toUpperCase();

    }
    static void res(String ans)
    {
            for(int i=ans.length()-1;i>=0;i--)
            {
                System.out.print(ans.charAt(i));
            }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String plate=s.nextLine();
        System.out.println(LetterAdd(plate));
        plate=LetterAdd(plate);
        int len=s.nextInt();
        String ans="";
        int ch=0;
        for(int i=plate.length()-1;i>=0;i--)
        {
            if(ch==len)
            {
                ans=ans+("-"+plate.charAt(i));
                ch=1;
            }
            else
            {
                ans=ans+(plate.charAt(i));
                ch++;
            }
            
        }
        res(ans);
       // System.out.println(ans);

    }
}

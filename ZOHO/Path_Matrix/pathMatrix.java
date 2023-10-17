package Path_Matrix;

import java.util.*;
public class pathMatrix {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int st=s.nextInt();
        int en=s.nextInt();
        int ar[][]={{2,3,4},{3,4,5},{6,7,8}};
        String path=">v<^";
        for(int i=0;i<path.length();i++)
        {
            if(path.charAt(i)=='>')
            {
                en++;
                System.out.print(ar[st][en]+" ");
            }
            else if(path.charAt(i)=='v')
            {
                st++;
                System.out.print(ar[st][en]+" ");
            }
            else if(path.charAt(i)=='<')
            {
                en--;
                System.out.print(ar[st][en]+" ");
            }
            else
            {
                st--;
                System.out.print(ar[st][en]+" ");
            }
        }
    }
}
package Perfect_Square;

import java.util.*;
public class perfect_sqr {
    static int checksqr(int sqr)
    {
        int flag=0;
        for(int i=1;i<sqr/2;i++)
        {
            if((i*i)==sqr)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            return 1;
        }

        return 0;
    }
    
    static int digiteven(int di)
    {
        while(di!=0)
        {
            int a=di%10;
            if(a%2!=0)
            {
                break;
            }
            di=di/10;
        }
        if(di==0)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int sqr=checksqr(num*num);
        System.out.println((sqr==1) ?((digiteven(num*num)==1 ? "1":"0")):"0");


    }
}

package MaximumGap;
import java.util.*;
public class MaximumGap {
    public static void main(String[] args) {
     
    Scanner s=new Scanner(System.in);
    
    int num[]={1,10000000};
    int st=0;
    int en=1;
    int an[]=new int[num.length-1];
    for(int i=0;i<an.length;i++)
    {
        
        an[i]=num[en]-num[st];
        st+=1;
        en+=1;
    }
    System.out.println(Arrays.toString(an));
    int ch=1;
    int max=an[0];
    for(int i=1;i<an.length;i++)
    {
        if(an[i]<0)
        { 
            ch++;
        }
        else if(max<an[i])
        {
            max=an[i];
        }

    }
    System.out.println(ch);
    int min=an[0];
    if(ch==an.length)
    {
        for(int i=1;i<an.length;i++)
        {
        if(min>an[i])
        {
            min=an[i];
        }

        }
        System.out.println(min);
    }



    

    }
}

import java.util.*;
public class Majority_Element {
    public static void main(String[] args) {
        int ar[]={2,2,1,1,1,2,2};
        Arrays.sort(ar);
        int a[]=new int[10];
        int in=0;
        for(int i=0;i<a.length;i++)
        {   
            a[i]=0;
        }
        for(int i=0;i<ar.length;i++)
        {
            a[ar[i]]=a[ar[i]]+1;
        }
        int max=a[0];
        int index=0;
        for(int i=1;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
                index=i;

            }
        }
        System.out.println(Arrays.toString(a)+" "+index);
        
    }
}

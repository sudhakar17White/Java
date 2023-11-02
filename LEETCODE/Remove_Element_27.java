import java.util.*;
public class Remove_Element_27 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num[]={0,1,2,2,3,0,4,2};
        int val=2;
        //remove and replace with _
        int dash=0;
        int count=0;
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<num.length;i++)
        {
            if(num[i]!=val)
            {
                //System.out.print(num[i]+" ");
                ar.add(num[i]);
                count++;
            }
            else
            {
                dash++;
            }
        }
        int ar2[]=new int[ar.size()];
        
        for(int i=0;i<ar.size();i++)
        {
            ar2[i]=ar.get(i);
        }
        //Arrays.sort(ar2);
        System.out.print(count+" "+Arrays.toString(ar2));
        
    }
}

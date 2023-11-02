import java.lang.reflect.Array;
import java.util.Arrays;

public class Two_Sum {

    public static void main(String[] args) {
        int target=6;
        int num[]={3,2,4};
        int index[]=new int[2];
        int br=0;
        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                if(num[i]+num[j]==target)
                {
                    index[0]=i;
                    index[1]=j;
                    br=1;
                    break;
                }
            }
            if(br==1)
            {
                break;
            }
        }
        System.out.println(Arrays.toString(index));

    }
}
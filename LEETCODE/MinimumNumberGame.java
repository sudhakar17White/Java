import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MinimumNumberGame {
    public static void main(String[] args) {
        int num[]={2,5};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        
        for(int i=0;i<num.length;i+=2)
        {
            int temp=num[i];
            num[i]=num[i+1];
            num[i+1]=temp;

        }
        System.out.println(Arrays.toString(num));
        

    }
}

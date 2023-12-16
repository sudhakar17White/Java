import java.util.ArrayList;
import java.util.Collections;

public class MaximumProductofTwoElementsinanArray {
    public static void main(String[] args) {
        int nums[] = {3,4,5,2};
        ArrayList<Integer> ar=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                ar.add((nums[i]-1)*(nums[j]-1));
            }
        }
        Collections.sort(ar);
        System.out.println(ar.get(ar.size()-1));
    }
}

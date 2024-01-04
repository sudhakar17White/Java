import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int heights[] = {1,1,4,2,1,3};
        int ar[]=Arrays.copyOf(heights,heights.length);
        Arrays.sort(heights);
        int count=0;
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i]!=ar[i])
            {
                count++;
            }
        }
        System.out.println(count);
    }
}

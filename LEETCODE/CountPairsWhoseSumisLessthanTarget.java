import java.util.ArrayList;

public class CountPairsWhoseSumisLessthanTarget {
    public static void main(String[] args) {
        
        ArrayList<Integer> nums=new ArrayList<>();
        int target=2;
        int count=0;
        for(int i=0;i<nums.size();i++)
        {
            for(int j=i+1;j<nums.size();j++)
            {
                if((nums.get(i)+nums.get(j))<target)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

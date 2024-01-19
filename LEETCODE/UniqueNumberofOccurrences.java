import java.util.Arrays;

public class UniqueNumberofOccurrences {
    public static void main(String[] args) {
        int arr[] = {1,2};
        int count=0;
        int ar[]=new int[arr.length];
        boolean ans=false;
        for(int i=0;i<arr.length;i++) 
        {
            for(int j=0;j<arr.length;j++)
            {
                if(Math.abs(arr[i])==Math.abs(arr[j]))
                {
                    count++;
                }
            }
            ar[i]=count;
            count=0;
            
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<ar.length;j++)
            {
            if(Math.abs(arr[i])==Math.abs(ar[i]))&&(i!=j))
            {
                ans=true;
                break;
            }
            }
        }
        System.out.println(ans);
        
    }
}

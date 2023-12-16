import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
     
        String s = "zlap", t = "kcqx"; 
        int arr1[]=new int[123];
        int arr2[]=new int[123];
        for(int i=0;i<123;i++)
        {
            arr1[i]=0;
            arr2[i]=0;
        }
        if(s.length()==t.length())
        {
            for(int i=0;i<t.length();i++)
            {
                arr1[(int)s.charAt(i)]=arr1[(int)s.charAt(i)]+1;
                arr2[(int)t.charAt(i)]=arr2[(int)t.charAt(i)]+1;
            }
            
        }
        System.out.println(Arrays.equals(arr1, arr2));
   
    }
}

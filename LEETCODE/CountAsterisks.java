import java.util.Arrays;

public class CountAsterisks {
    public static void main(String[] args) {
        String s="l|*e*et|c**o|*de|";
        int in=1;
        String ar[]=s.split("\\|");
       
        
        System.out.println(Arrays.toString(s.split("\\|")));
       // System.out.println();
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar[i].length();j++)
            {
                
                if((ar[i].length()!=1&&ar[i].length()-1!=j)&&((ar[i].charAt(j))==(ar[i].charAt(j+1))))
                {   System.out.println(i+":"+ar[i].charAt(j));
                    in++;
                }
                
            }
            
        }
        System.out.println(in);

    }
}

package NumPair_With_concate_String;
import java.util.*;

public class numpair_with_con_str {
    static int numpair(String target,String ar[])
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar.length;j++)
            {
                if(i!=j)
                {
                    if((ar[i]+ar[j]).equals(target))
                    {
                        System.out.println("("+i+","+j+"):"+ar[i]+" + "+ar[j]);
                        count++;
                    }
                }
                
            }
        }


        return count;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String target=s.nextLine();
        int l=s.nextInt();
        s.nextLine();
        String ar[]=new String[l];
        for(int i=0;i<l;i++)
        {
            ar[i]=s.nextLine();
        }
        System.out.println(numpair(target,ar));
        
    }
}

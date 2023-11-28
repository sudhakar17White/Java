/**
 * DivisibleandNon-divisibleSumsDifference
 */
public class DivisibleandNondivisibleSumsDifference {

    public static void main(String[] args) {
        int n=10;
        int m=3;
        int notdiv=0;
        int div=0;
        for(int i=1;i<=n;i++)
        {
            if(i%m==0)
            {
                div=div+i;
               System.out.println(i);
            }
            else
            {   
                
                notdiv=notdiv+i;
            }
        }
        System.out.println(notdiv+" "+div+" "+(notdiv-div));
    }
}
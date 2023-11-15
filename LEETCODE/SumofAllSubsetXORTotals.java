public class SumofAllSubsetXORTotals {
    public static void main(String[] args) {
        int an[]={3,4,5,6,7,8};
        int tot=0;
        int in=0;
        int tx=0;
        for(int i=0;i<6;i++)
        {
            for(int j=1;j<6;j++)
            {
                if(i!=j&&in!=an.length)
                {
                    tot=tot+(an[i]^+an[j]);
                    
                    in++;
                }

            }
            tx=tx+an[i];
        }
        System.out.println(tx+tot+tot%3);
        

    }
}

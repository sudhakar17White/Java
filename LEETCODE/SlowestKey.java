import java.util.Arrays;

public class SlowestKey {
    public static void main(String[] args) {
        int keyrelesed[]={12,23,36,46,62};
        String keypress="spuda";
        int nxt=1;
        int ans[]=new int[keyrelesed.length];
        ans[0]=keyrelesed[0];
        int in=1;
        for(int i=0;i<keyrelesed.length-1;i++) 
        {
            ans[in]=keyrelesed[nxt]-keyrelesed[i];
            in++;
            nxt++;
        }

        System.out.println(Arrays.toString(ans));
        int max=ans[0];
        int index=0;
        for(int i=1;i<ans.length;i++)
        {
            if(max<ans[i])
            {
                max=ans[i];
                index=i;
            }
        }
        System.out.println(keypress.charAt(index));
        
    }
    
}

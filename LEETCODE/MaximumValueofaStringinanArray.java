import java.util.Arrays;

public class MaximumValueofaStringinanArray {
    static int checkNum(String an)
    {
        int ch=0;
        for(int i=0;i<an.length();i++)
        {
            
            if(Character.isDigit(an.charAt(i)))
            {
                ch++;
            }

        }
        if(ch==an.length())
        {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        String strs[]={"alic3","bob","3","4","00000"};
        int ans[]=new int[strs.length];
        for(int i=0;i<strs.length;i++)
        {
            if(checkNum(strs[i])==1)
            {
                ans[i]=Integer.parseInt(strs[i]);  
            }
            else{
                ans[i]=strs[i].length();
            }
        }
        Arrays.sort(ans);
        System.out.println(ans[ans.length-1]);
    }
}

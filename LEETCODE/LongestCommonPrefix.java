import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String s[]={"dog","racecar","car"};
        int value[]=new int[123];
        for(int i=0;i<value.length;i++)
        {
            value[i]=0;
        }
        for(int i=0;i<s.length;i++)
        {
            for(int j=0;j<s[i].length();j++)
            {
                value[(int)s[i].charAt(j)]=value[(int)s[i].charAt(j)]+1;
            }
        }
        int max=value[97];
        for(int i=98;i<123;i++)
        {
            if(max<value[i])
            {
                max=value[i];
            }
           
        }
        System.out.println(Arrays.toString(value));
        System.out.println(max);
        String ans="";
        for(int i=97;i<123;i++)
        {
            if(max==value[i])
            {
                ans=ans+(char)i;
               // System.out.print((char)i);
            }
        }
        System.out.println(ans);
        int ch=0;
        for(int i=0;i<s.length;i++)
        {
            if(ans.equals(s[i].substring(0,ans.length())))
            {
                ch++;
            }
        }
        System.out.println(ch);
        if(ch==s.length)
        {
            System.out.println(ans);
        }
        else
        {
            System.out.println("-");
        }
    }
}
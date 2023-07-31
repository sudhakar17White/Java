import java.util.*;
class isomarphic
{
    static int is(String one)
    {
        int o[]=new int[one.length()];
        for(int i=0;i<one.length();i++)
        {
            for(int j=0;j<one.length();j++)
            {
                if(one.charAt(i)==one.charAt(j))
                {
                    o[i]=o[i]+1;
                }
            }
        }
        int num=0;
        for(int i=0;i<one.length();i++)
        {
            num=(num*10)+o[i];
        }
        
        return num;
    }
    static void isomar(String one,String two)
    {
        if(one.length()==two.length())
        {
                int is=is(one);
                int si=is(two);
                if(is==si)
                {
                    System.out.println("True");
                }
                else
                {
                    System.out.println("False");
                }

        }
        else
        {
            System.out.println("True");
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        isomar(s.nextLine(),s.nextLine());

    }
}
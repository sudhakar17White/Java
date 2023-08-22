import java.util.*;
public class code {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String one=s.nextLine();
        String two=s.nextLine();
        int num=s.nextInt();
        int ni=s.nextInt();
        String n=String.valueOf(num);
        StringBuilder re=new StringBuilder(n);
        re.reverse();
        if(one.length()==two.length())
        {
            
            for(int i=0;i<one.length();i++)
            {
                if(one.charAt(i)!=two.charAt(i))
                {
                    if((int)one.charAt(i)<(int)two.charAt(i))
                    {
                        System.out.println((""+one.charAt(ni-1)).toUpperCase()+two+n.charAt(ni-1)+re.charAt(ni-1));
                        break;
                    }
                    else
                    {
                        System.out.println((""+two.charAt(ni-1)).toUpperCase()+one+n.charAt(ni-1)+re.charAt(ni-1));
                        break;
                    }
                }
            }
            
        }
        else
        {
            
            if(one.length()>two.length())
            {
                System.out.println(one.charAt(ni-1)+two+n.charAt(ni-1)+re.charAt(ni-1));
            }
            else
            {
                System.out.println(two.charAt(ni-1)+one+n.charAt(ni-1)+re.charAt(ni-1));
                
            }
        }

    }
}

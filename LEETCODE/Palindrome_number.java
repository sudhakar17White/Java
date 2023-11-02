import java.util.*;
class Palindrome_number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int number =s.nextInt();
        boolean in=false;
        int val=number;
        int res=0;
        if(number>=0)
        {
            
            while(number!=0)
            {
                int a=number%10;
                res=res*10+a;
                number=number/10;
            }
            if(val==res)
            {
                in=true;
            }
        }
        System.out.println(in);
        

    }
}
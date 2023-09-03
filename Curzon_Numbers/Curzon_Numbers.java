package Curzon_Numbers;
import java.util.*;


public class Curzon_Numbers {
    static int pow(int num)
    {
        return ((int)(Math.pow(2, num)))+1;
    }
    static int math(int num)
    {
        return (2*num)+1;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        if(pow(num)%math(num)==0)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}

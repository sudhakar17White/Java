import java.math.BigInteger;

public class Reverse_Bits {
    public static void main(String[] args) {
       String n="00000010100101000001111010011100";
       System.out.println(String.valueOf(n));
       StringBuilder str=new StringBuilder(n);
       System.out.println(Integer.parseInt(""+str,2));
        

    }
}

import java.math.BigInteger;

public class Reverse_Bits {
    public static void main(String[] args) {
       // String n=00000010100101000001111010011100+"";
        BigInteger bi=new BigInteger("00000010100101000001111010011100");
        int br=Integer.parseInt("00000010100101000001111010011100",2);
        String val=String.valueOf(bi);
        System.out.println(br);

    }
}

public class Numberof1Bits {
    public static void main(String[] args) {
        String bi =Integer.toBinaryString(0001);
        int count=0;
        for(int i=0;i<bi.length();i++)
        {
            if(bi.charAt(i)=='1')
            {
                count++;
            }
        } 
        System.out.println(count);
    }
}

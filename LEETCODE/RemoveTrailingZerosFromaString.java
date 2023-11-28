public class RemoveTrailingZerosFromaString {
    public static void main(String[] args) {
        String num = "123";
        int index=0;
        for(int i=num.length()-1;i>=0;i--) 
        {
            if(num.charAt(i)!='0')
            {
                index=i;
                break;
            }
        }
        System.out.println(num.substring(0, index+1));
    }
}

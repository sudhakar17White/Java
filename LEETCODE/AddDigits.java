public class AddDigits {
    static int addnum(int num)
    {
        int add=0;
        while(num!=0)
        {
            int ad=num%10;
            add=(add+ad);
            num=num/10;
        }
        System.out.println(add);
        return add;
    }
   public static void main(String[] args) {
        int num=38;
        while(num>=10)
        {
            num=addnum(num);
        }
        System.out.println(num);
   } 
}

import java.util.ArrayList;

public class FizzBuzz {
    public static void main(String[] args) {
        int n=3;
        ArrayList<String> st=new ArrayList<String>();
        for(int i=1;i<=n;i++)
        {
           if(i%3==0&&i%5==0)
           {
                System.out.println("fizzbuzz");
                st.add("FizzBuzz");
           } 
           else if(i%3==0)
           {
                st.add("Fizz");
           }
           else if(i%5==0)
           {
                st.add("Buzz");
           }
           else
           {
                st.add(""+i);
           }
        }
        System.out.println(st);
    }
}

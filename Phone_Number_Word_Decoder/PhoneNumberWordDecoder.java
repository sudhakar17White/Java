import java.util.*;
public class PhoneNumberWordDecoder {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        HashMap<Integer,String> hs=new HashMap<>();
        hs.put(0, "none");
        hs.put(1, "none");
        hs.put(2, "ABC");
        hs.put(3, "DEF");
        hs.put(4, "GHI");
        hs.put(5, "JKL");
        hs.put(6, "MNO");
        hs.put(7, "PQRS");
        hs.put(8, "TUV");
        hs.put(9, "WXYZ");
        System.out.println(hs);

        String number=s.nextLine();
        String ans="";
        for(int i=0;i<number.length();i++)
        {
            if((Character.isLetter(number.charAt(i))))
            {
                for(int j=0;j<hs.size();j++)
                {
                    String ch=hs.get(j);
                    for(int k=0;k<ch.length();k++)
                    {
                        if(ch.charAt(k)==number.charAt(i))
                        {
                            ans=ans+""+j;
                        }
                    }
                }
            }
            else
            {
                ans=ans+number.charAt(i);
            }

        }
        System.out.println(ans);
        
        
        
        
        
        
        
        

    }
}

import java.util.ArrayList;
import java.util.Arrays;


public class Noting {

    
    public static void main(String[] args) {
        // TODO code application logic here
        String word="This is a test input string ";
        String ch="st";
        ArrayList<String> ar=new ArrayList<>();
        String add="";
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==' '||i==word.length())
            {
                ar.add(add);
                add="";
            }
            else
            {
                add=add+word.charAt(i);
            }
               
        }  
        int arr[]=new int[2];
        int fl=0;
        int in=0;
        for(int i=0;i<ar.size();i++)
        {
            String a=ar.get(i);
            for(int j=0;j<a.length();j++)
            {
               for(int k=j;k<a.length();k++)
                {
                if(a.charAt(j)==ch.charAt(0))
                {
                    if((a.charAt(k)==ch.charAt(1)))
                    {
                        arr[in]=i;
                        //System.err.println(i);
                        in++;
                        fl=1;
                        break;
                       
                    }
                   
                }
                
                }
                if(fl==1)
                {
                    break;
                }
            }
            fl=0;
        }
        
        String f=ar.get(arr[0]);
        String s=ar.get(arr[1]);
        ar.set(arr[0], s);
        ar.set(arr[1],f);
        //System.out.println(ar);
        for(int i=0;i<ar.size();i++)
        {
            System.out.print(ar.get(i)+" ");
        }

    }
   
}
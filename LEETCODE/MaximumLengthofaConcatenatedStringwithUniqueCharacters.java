import java.util.ArrayList;
import java.util.List;

public class MaximumLengthofaConcatenatedStringwithUniqueCharacters {
    static int unichar(String ar)
    {
        
        for(int i=0;i<ar.length();i++)
        {
            for(int j=i+1;j<ar.length();j++)
            {
                if (ar.charAt(i)==ar.charAt(j)) {
                    return 2;   
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        List<String> a=new ArrayList<String>();
        a.add("aa");
        a.add("bb");
        List<String> arr=new ArrayList<>();
        for(int i=0;i<a.size();i++)
        {
            if(unichar(a.get(i))==1)    
            {
                arr.add(a.get(i));
            }
        }
        //System.out.println(arr.size());
        if(arr.size()>=1)
        {
        int single=arr.get(0).length();
        int con=0;
        for(int i=1;i<arr.size();i++)
        {
            if(single<arr.get(i).length())
            {
                single=arr.get(i).length();
            }
        }
        if (arr.size()>2) {
            con=(arr.get(0)+arr.get(1)).length();
        
        for(int i=0;i<arr.size();i++)
        {
            for(int j=i+1;j<arr.size();j++)
            {
                if(con<=(arr.get(i)+arr.get(j)).length())
                {
                    con=(arr.get(i)+arr.get(j)).length();
                }
            }
        }
    }
        if(single<con)
        {
            System.out.println(con);
        }
        else
        {
            System.out.println(single);
        }
    }
    else
    {
        System.out.println("0");
    }
    }
}

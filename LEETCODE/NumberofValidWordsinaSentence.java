import java.util.Arrays;

public class NumberofValidWordsinaSentence {
    public static void main(String[] args) {
       String sentence = "cat and  dog";
       String ans[]=sentence.split(" ");
       int count=0;
       boolean a=true;
       int space=0;
       System.out.println(Arrays.toString(ans));
       for(int i=0;i<ans.length;i++)
       {
            if(ans[i].equals(""))
            {
                space++;
            }
       }
       System.out.println(space);
       for(int i=0;i<ans.length;i++)
       {
            for(int j=0;j<ans[i].length();j++)
            {
                if(!Character.isAlphabetic(ans[i].charAt(j)))
                {
                   a=false;
                   break;
                }
                
            }
            if(a)
            {
                count++;
            }
            else
            {
                a=true;
                break;
            }
            
       }
       System.out.println(count-space);
      
    }
}

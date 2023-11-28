import java.util.Arrays;

public class SortVowelsinaString {
    static char vowels(char a)
    {
        if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
        {
            return a;
        }
        else
        {
            return '!';
        }
    }   
    public static void main(String[] args) {
        String s = "lEetcOde";
        String ans="";
        String soalp="";
        for(int i=0;i<s.length();i++)
        {
           if(vowels(s.charAt(i))!='!')
           {
                soalp=soalp+s.charAt(i);
           }
           
        }  
        
        char an[]=soalp.toCharArray();
        Arrays.sort(an);
       
        int in=0;
        for(int i=0;i<s.length();i++)
        {
           if(vowels(s.charAt(i))!='!')
           {
                ans=ans+(an[in]);
                in++;    
           }
           else
           {
                ans=ans+(s.charAt(i));
           }
        }
        
        
    }
}

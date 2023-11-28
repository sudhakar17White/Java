public class ReverseVowelsofaString {
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
        String s="hello";
        int last=s.length()-1;
        for(int i=0;i<s.length()/2;i++)
        {
           if(vowels(s.charAt(i))!='!')
           {
             
           }
            
        }
        System.out.println(s);
    }
}

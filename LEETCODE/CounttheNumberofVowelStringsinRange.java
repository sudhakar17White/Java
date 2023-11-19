public class CounttheNumberofVowelStringsinRange {
    public static void main(String[] args) {
        String words[]={"are","amy","u"};
        int left = 0;int right = 2;
        int ch=0;
        for(int i=left;i<=right;i++) 
        {
            if(words[i].length()==1)
            {
                if(words[i].charAt(0)=='a'||words[i].charAt(0)=='e'||words[i].charAt(0)=='i'||words[i].charAt(0)=='o'||words[i].charAt(0)=='u')
                {
                    ch++;
                }
            }
            else if((words[i].charAt(0)=='a'||words[i].charAt(0)=='e'||words[i].charAt(0)=='i'||words[i].charAt(0)=='o'||words[i].charAt(0)=='u')&&(words[i].charAt(words[i].length()-1)=='a'||words[i].charAt(words[i].length()-1)=='e'||words[i].charAt(words[i].length()-1)=='i'||words[i].charAt(words[i].length()-1)=='o'||words[i].charAt(words[i].length()-1)=='u'))
            {
                ch++;
            }
        }
        System.out.println(ch);
    }
}

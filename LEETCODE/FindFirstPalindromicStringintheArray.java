public class FindFirstPalindromicStringintheArray {
    public static void main(String[] args) {
        String words[]={"abc","car","ada","racecar","cool"};
        for(int i=0;i<words.length;i++)
        {
           
           if(words[i].equals(""+new StringBuilder(words[i]).reverse()))
           {
                System.out.println(words[i]);
                break;
           }    
        }
    }
}

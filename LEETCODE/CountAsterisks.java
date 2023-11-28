public class CountAsterisks {
    public static void main(String[] args) {
        String s="l|*e*et|c**o|*de|";
        int in=0;
        for(int i=0;i<s.length();i++) 
        {
            if(s.charAt(i)=='*')
            {
                in++;
            }
        }

    }
}

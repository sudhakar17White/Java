public class FindMaximumNumberofStringPairs {
    public static void main(String[] args) {
        String words[]={"cd","ac","dc","ca","zz"};
        int count=0;
        
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if((new StringBuilder(words[i]).reverse()+"").equals(words[j]))
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

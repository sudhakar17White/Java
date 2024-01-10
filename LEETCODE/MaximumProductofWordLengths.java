public class MaximumProductofWordLengths {
    static Boolean check(String fi,String tw)
    {
        boolean ans =true;
        for(int i=0;i<fi.length();i++)
        {
            for(int j=0;j<tw.length();j++)
            {
                if(fi.charAt(i)==tw.charAt(j))
                {
                    ans=false;
                    break;
                }
            }
            if(ans==false)
            {
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String words[] = {"a","b","c"};
        int size=0;
        int ex=0;
        for(int i=words.length-1;i>=0;i--)
        {
            
            for(int j=0;j<i;j++)
            {
                if((words[j].length()!=1)&&check(words[i],words[j]))
                {
                    
                    size=words[i].length()*words[j].length();
                    ex=1;
                    break;
                }
            }
            if(ex==1)
            {
                break;
            }
            
        }
        System.out.println(size);
    }
}

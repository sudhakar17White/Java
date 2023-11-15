public class SortingtheSentence {
    public static void main(String[] args) {
        String s="is2 sentence4 This1 a3";
        String ar[]=s.split(" ");
        int in=1;
        String ans="";
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar.length;j++)
            {
                if(in==Integer.parseInt(""+ar[j].charAt(ar[j].length()-1)))
                {
                    ans=ans+(ar[j].substring(0, ar[j].length()-1));
                    in++;
                }
            }
           // in++;
        }
    }
}

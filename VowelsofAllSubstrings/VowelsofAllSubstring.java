import java.util.*;
public class VowelsofAllSubstring {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();
        String com[]=new String[word.length()*word.length()];
        int in=0;
        for(int i=0;i<word.length();i++)
        {
            for(int j=i;j<=word.length();j++)
           {
                System.out.println(word.substring(i, j));
                com[in]=word.substring(i, j);
                in++;
           }
        }
        // to check vowels

        int sum=0;
        for(int i=0;i<com.length;i++)
        {
            for(int j=0;j<com[i].length();j++)
            {
                if(com[i].charAt(j)=='a'||com[i].charAt(j)=='e'||com[i].charAt(j)=='e'||com[i].charAt(j)=='i'||com[i].charAt(j)=='o'||com[i].charAt(j)=='u')
                {
                    sum++;
                }
            }
        }
        System.out.println("\nTotal Vowels in a SubString :"+sum);

    }
}

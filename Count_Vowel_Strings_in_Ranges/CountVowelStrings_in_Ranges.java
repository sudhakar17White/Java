import java.util.*;
class CountVowelStrings_in_Ranges {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Number of words:");
        int len=s.nextInt();
        s.nextLine();
        String word[]=new String[len];
        for(int i=0;i<len;i++)
        {
            word[i]=s.nextLine();
        }
         System.out.println(Arrays.toString(word));
        
        System.out.println("Len of quries:");
        int qr=s.nextInt();
        int q[][]=new int[qr][2];
        for(int i=0;i<qr;i++)
        {
            for(int j=0;j<2;j++)
            {
                q[i][j]=s.nextInt();
            }
        }
        
        int ans[]=new int[qr];
       
        int i=0;
        int st=0,en=0;
        int count=0;
        for(int j=0;j<qr;j++)
        {   
            st=q[j][0];
            en=q[j][1];
           // System.out.println(st+" "+en);
            for(int x=st;x<=en;x++)
            {
                //System.out.println(word[0]);
                String ar=word[x];
                //System.out.println(st+" "+en);
                //System.out.println(ar+" "+x+" "+en);
                for(int h=0;h<ar.length();h++)
                {
                    if(word[x].charAt(h)=='a'|| word[x].charAt(h)=='e'||word[x].charAt(h)=='i'||word[x].charAt(h)=='o'||word[x].charAt(h)=='u')
                    {
                        count++;
                        break;
                    }
                }
                
            }
            System.out.println(count);
            ans[i]=count;
            count=0;
            i++;
           // System.out.println(count);
        }
         System.out.println(Arrays.toString(ans));


    }
}
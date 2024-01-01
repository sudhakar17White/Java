public class AssignCookies {
    public static void main(String[] args) {
        int g []= {10,9,8,7};
        int s []= {5,6,7,8};
        int co=0;
        int  j=0;
        for(int i=0;i<s.length;i++)
        {
            for(;j<g.length;j++)
            {
                if(s[i]>=g[j])
                {
                    co++;
                    break;

                }
            }
            j=j+1;
            
        }
        System.out.println(co);
    }
}

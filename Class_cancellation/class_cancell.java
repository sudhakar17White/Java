package Class_cancellation;

import java.util.*;
class class_cancell {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int total=s.nextInt();
        int late=s.nextInt();
        s.nextLine();
        String ontime=s.nextLine();
        String time[]=new String[total];
        for(int i=0;i<total;i++)
        {
            time[i]=s.nextLine();
        }
        
        String otime[]=ontime.split(":");
        System.out.println(Arrays.toString(otime));
        int comers=0;
        int odd=1;
        int even=2;
        if(otime[0].length()==2)
        {
            odd=2;
            even=3;
        }

        for(int i=0;i<total;i++)
        {
            if(Integer.parseInt(time[i].substring(0, odd))<=(Integer.parseInt(otime[0].substring(0, odd)))&&(Integer.parseInt(time[i].substring(even, time[0].length()-1)))<=(Integer.parseInt(otime[1].substring(0, otime[1].length()-1))))
            {
                comers++;
            }
        }
        System.out.println((comers<late)?"Yes":"No");
       

    }
}

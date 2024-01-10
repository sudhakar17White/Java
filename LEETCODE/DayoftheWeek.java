import java.util.HashMap;

public class DayoftheWeek {
    static int cal(HashMap mo)
    {
        return 1;
    }
    public static void main(String[] args) {
        int day = 31; int month = 8; int year = 2019;
        HashMap<Integer,Integer>mo=new HashMap<>();
        String days[]={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        //month deatils add
        mo.put(1,31);
        mo.put(2,28);
        mo.put(3, 31);
        mo.put(4, 30);
        mo.put(5, 31);
        mo.put(6, 30);
        mo.put(7, 31);
        mo.put(8, 31);
        mo.put(9, 30);
        mo.put(10, 31);
        mo.put(11, 30);
        mo.put(12, 31);
        int tot=0;
        // if(year%400==0||year%4==0)
        // {
        //     mo.put(2,29);
        //     System.out.println(days[(cal(mo,)%month)/6]);
        // }
        // else
        // {

        // }
        int i=0;
        int j=0;
        while (i!=226) {
            if(j==7)
            {j=0;
            }
            
            j++;
            i++;
        }
        System.out.println(days[j]);
        
    }
}

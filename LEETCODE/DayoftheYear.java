import java.util.HashMap;

public class DayoftheYear {
    public static void main(String[] args) {
        String date = "1900-05-02";
        HashMap<Integer,Integer>mo=new HashMap<>();
        mo.put(1,31);
        mo.put(2,28);
        mo.put(3,31);
        mo.put(4,30);
        mo.put(5,31);
        mo.put(6,30);
        mo.put(7,31);
        mo.put(8,31);
        mo.put(9,30);
        mo.put(10,31);
        mo.put(11,30);
        mo.put(12,31);
        int tot=0;
        if((Integer.parseInt(date.substring(0,4)) % 4 == 0) && (Integer.parseInt(date.substring(0,4)) % 100!= 0) || (Integer.parseInt(date.substring(0,4)) % 400 == 0))
        {
            mo.put(2,29);
            System.out.println("Leap");
            for(int i=1;i<Integer.parseInt(date.substring(5,7));i++)
            {
                tot=tot+mo.get(i);
            }
        }
        else
        {
            for(int i=1;i<Integer.parseInt(date.substring(5,7));i++)
            {
                tot=tot+mo.get(i);
            }
        }
        System.out.println(tot+Integer.parseInt(date.substring(8,10)));

    }
}

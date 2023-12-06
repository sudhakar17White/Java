import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 * WheatherApi
 */
public class WheatherApi {

    public static void main(String[] args) {
        try {
         
            Scanner s1=new Scanner(System.in);
            System.out.println("Enter the City OR Country:");
            URL url=new URL("https://api.openweathermap.org/data/2.5/weather?q="+s1.nextLine()+"&appid=886705b4c1182eb1c69f28eb8c520e20");
            HttpURLConnection con=(HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.connect();

            
            Scanner s=new Scanner(url.openStream());
            String ans="";
            while (s.hasNext()) {
                ans=ans+(s.nextLine());
            }
            s.close();

            
            String an[]=ans.split(",");
            //System.out.println(Arrays.toString(an));
            for(int i=0;i<an.length;i++)
            {
                System.out.println(an[i]+" -"+i);
            }
            System.out.println("City:"+an[26].substring(an[26].indexOf(':')+1,an[26].length()-1));
            System.out.println("Humidity:"+an[12].substring(an[12].indexOf(':')+1,an[12].length()));
            System.out.println(an[21].substring(an[21].indexOf(':')+2,an[21].length()));
        
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
class Hostel_Management  {
        JSONObject countryObj = new JSONObject();  
        Scanner s=new Scanner(System.in);
        
        void add_data()
        {
            countryObj.put(s.nextLine(),s.nextLine());
        }
        void exportdata()
        {
            try {  

            
            File file=new File("details.json");  
            file.createNewFile();  
            FileWriter fileWriter = new FileWriter(file);  
            
            System.out.print(countryObj);  

            fileWriter.write(countryObj.toJSONString());  
            fileWriter.flush();  
            fileWriter.close();  

        } catch (IOException e) {  
            e.printStackTrace();  
        }
        
       }
         


        



}


public class App {
        static void banner()
        {
            System.out.println("..... HOSTEL MANAGEMENT ......");  
        }
    public static void main(String[] args) {
        banner();
        String ch="";
        Hostel_Management hm=new Hostel_Management();
        do{
            ch=new Scanner(System.in).nextLine();
            if(ch.equals("add"))
            {
                hm.add_data();  
            }
            else if(ch.equals("exp"))
            {
                hm.exportdata();
            }

        }while(!ch.equals("exit"));
          

    }
}

package IntegertoEnglishWords;
import java.util.*;
public class IntegerTOenglish {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String number=s.nextLine();
        //normal method to inzilation
        HashMap<String, String> less20 = new HashMap<>(){{
            put("1","one");put("2","two");put("3","three");put("4","four");
            put("5","five");put("6","six");put("7","seven");
            put("8","eight");put("9","nine");put("10","ten");put("11","eleven");
            put("12","tewele");put("13","thirteen");put("14","Fourteen");put("15","Fifiteen");
            put("16","sixteen");put("17","seventeen");put("18","eighteen");put("19","nineteen");;
        }};
         HashMap<String,String> less2=new HashMap<>(){{
            put("one","1");put("two","2");put("three","3");put("four","4");
            put("five","5");put("six","6");put("seven","7");
            put("eight","8");put("nine","9");put("ten","10");put("eleven","11");
            put("tewele","12");put("thirteen","13");put("Fourteen","14");put("Fifiteen","15");
            put("sixteen","16");put("seventeen","17");put("eighteen","18");put("nineteen","19");}};
        //couple facter method
   Map<String, String> above20 = Map.of(
    "2", "twenty",
    "3", "thirty",
    "4","Fourty",
    "5","Fifity","6","sixty","7","seventy","8","eighty","9","ninehty");
         int ch=10;
       String ans="";
       if(number.length()==2)
       {
            if(Integer.parseInt((less2.get(less20.get(number))))<20)
            {
                System.out.println(less20.get(number));
            }
            else
            {
            for(int i=number.length()-1;i>=0;i--)
            {
            switch(ch)
            {
                case 10:
                        ans=ans+less20.get(String.valueOf(""+number.charAt(i)))+" ";
                        ch=ch+90;
                        break;
                case 100:
                        ans=ans+above20.get(String.valueOf(""+number.charAt(i)))+" ";
                        ch=ch+900;
                        break;
            }
            }
            String as[]=ans.split(" ");
        for(int i=as.length-1;i>=0;i--)
       {
        System.out.print(as[i]+" ");
       }

        }
    }
    else if(number.length()<=3)
       {
       for(int i=number.length()-1;i>=0;i--)
       {
            switch(ch)
            {
                case 10:
                        ans=ans+less20.get(String.valueOf(""+number.charAt(i)))+" ";
                        ch=ch+90;
                        break;
                case 100:
                        ans=ans+above20.get(String.valueOf(""+number.charAt(i)))+" ";
                        ch=ch+900;
                        break;
                case 1000:
                        ans=ans+"Hundered "+less20.get(String.valueOf(""+number.charAt(i)))+" ";
                        ch=ch+9000;
                        break;
            }
       }
    

      String as[]=ans.split(" ");
      for(int i=as.length-1;i>=0;i--)
      {
        System.out.print(as[i]+" ");
      }
       
    }
    else
    {
        if(number.length()==4)
        {
            for(int i=number.length()-1;i>=1;i--)
       {
            switch(ch)
            {
                case 10:
                        ans=ans+less20.get(String.valueOf(""+number.charAt(i)))+" ";
                        ch=ch+90;
                        break;
                case 100:
                        ans=ans+above20.get(String.valueOf(""+number.charAt(i)))+" ";
                        ch=ch+900;
                        break;
                case 1000:
                        ans=ans+"Hundered "+less20.get(String.valueOf(""+number.charAt(i)))+" ";
                        ch=ch+9000;
                        break;
            }
       }
       ans=ans+less20.get(String.valueOf(""+number.charAt(0)))+"Thousand ";
    

      String as[]=ans.split(" ");
      for(int i=as.length-1;i>=0;i--)
      {
        System.out.print(as[i]+" ");
      }
        }
        else
        {
            for(int i=number.length()-1;i>=2;i--)
            {
            switch(ch)
            {
                case 10:
                        ans=ans+less20.get(String.valueOf(""+number.charAt(i)))+" ";
                        ch=ch+90;
                        break;
                case 100:
                        ans=ans+above20.get(String.valueOf(""+number.charAt(i)))+" ";
                        ch=ch+900;
                        break;
                case 1000:
                        ans=ans+"Hundered "+less20.get(String.valueOf(""+number.charAt(i)))+" ";
                        ch=ch+9000;
                        break;
            }
       }
       System.out.println(number.substring(0, 2));
       ans=ans+above20.get(String.valueOf(""+number.substring(0, 2)))+"Thousand ";
    

      String as[]=ans.split(" ");
      for(int i=as.length-1;i>=0;i--)
      {
        System.out.print(as[i]+" ");
      }
        }
        
    }


    }

    
}

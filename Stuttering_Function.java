import java.util.*;
class stuttering 
{

    void funcation(String word)
    { 

        String ans="";
        String sub="";
        sub=sub+word.charAt(0)+word.charAt(1);

      

        for(int i=0;i<3;i++)
        { 

            ans=ans+".";

        }

        System.out.println(sub+ans+sub+ans+word);


    }




}


class Stuttering_Function
{ 
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the word:");
        String word=s.nextLine();

        stuttering st=new stuttering();


        st.funcation(word);




    }




}
import java.util.*;
class String_Matches
{ 
    public static void main(String[] args) {

        
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the first string:");
        String first=s.nextLine();

        System.out.println("Enter the second string:");
        String seond=s.nextLine();


        // to  get seond string size

        int size=seond.length();

        char a=0,b=0;
        int count=-1;

        for(int i=0;i<first.length();i++)
        { 

            a=first.charAt(i);
            //ar=ar+a;
            for(int j=0;j<seond.length();j++)
            { 

               b=seond.charAt(j);
            
               int com=Character.compare(a, b);
                if(com==0)
                { 

                   
                    count=count+1;


                }


            }

            a=0;
            b=0;

        }

        if(size==count)
        { 

            System.out.println("Equal");

        }
        else
        {

            System.out.println("Not Equal");

        }
        







    }




}
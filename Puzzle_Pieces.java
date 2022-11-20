import java.util.Scanner;

public class Puzzle_Pieces {

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the size of array:");
        int size=s.nextInt();

        int first[]=new int[size];
        int second[]=new int[size];

        int tot[]=new int[size];

        for(int i=0;i<size;i++)
        { 


            System.out.print("Enter the first array value:");
            first[i]=s.nextInt();


            System.out.print("Enter the second array value:");
            second[i]=s.nextInt();
            

        }

        //add the two array loop

        System.out.println("calculating......");
        for(int i=0;i<size;i++)
        {


            
            tot[i]=first[i]+second[i];
            System.out.println(first[i]+"+"+second[i]+"="+tot[i]);

        }

        int check=tot[0];
        int count=1;
        for(int i=1;i<size;i++)
        {

            if(check==tot[i])
            { 

                count++;


            }



        }
        if(count==size)
        { 

            System.out.println("Two array add is same");

        }
        else
        { 

            System.out.println("Array are not same");

        }



    }


    
}
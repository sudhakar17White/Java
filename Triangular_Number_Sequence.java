import java.util.*;
class Triangular_Number_Sequence
{ 
    public static void main(String[] args) {
        

        Scanner s=new Scanner(System.in);

        //to create an array with size 
        System.out.println("Enter the size of array:");
        int size=s.nextInt();

        int number[]=new int[size];

        int i=0;
        // to get input from user 
        for(i=0;i<size;i++)
        { 

            number[i]=s.nextInt();


        }


        int value=0;
        for(i=0;i<size;i++)
        { 


            for(int j=1;j<=number[i];j++)
            { 

                value=value+j;


            }

            System.out.println("Triangle of "+number[i]+" ->"+value);
            value=0;


        }



    }



}
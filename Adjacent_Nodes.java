import java.util.*;
class Adjacent_Nodes
{ 
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);

        System.out.println("Number of nodes:");
        int size=s.nextInt();


        int node[][]=new int[size][size];

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            { 

                System.out.print("node "+i+"to "+j+"\n");
                
                node[i][j]=s.nextInt();

            }


        }
        
        for(int i=0;i<size;i++)
        {

            System.out.print("{");
            for(int j=0;j<size;j++)
            { 

                System.out.print(node[i][j]+" ");
                

            }
            System.out.print("}\n");

        }

        System.out.println("soruce point:");
        int r=s.nextInt();

        System.out.println("Destion point:");
        int d=s.nextInt();

        if(node[r][d]==1)
        { 

            System.out.println("True");

        }
        else
        {

            System.out.println("False");

        }


    }


}
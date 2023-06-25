import java.util.*;
class closed_islands {

    static int colcheck(int mat[][],int i,int j,int col)
    {
        int cr=0;
        //System.out.println(col);
        for(int r=0;r<col;r++)
        {
            if(mat[i][j]==1)
            {
                cr=cr+1;
                //System.out.println(mat[i][j]+"count= "+cr);
                
                i++;
            }
            else
            {
               
                break;
                
            }
        }
       
    return cr;
    }

    static void process(int mat[][],int row,int col)
    {
        int rec=col;
         int r=0,c=0,min=0,inr=0,inc=0;
         int row1[]=new int[2];
         int col1[]=new int[2];
         for(int i=0;i<row;i++)
         {
            for(int j=0;j<col;j++)
            {
                if(mat[i][j]==1)
                {
                    int val=colcheck(mat,i,j,col);
                  //  System.out.println(val+" "+col);
                    if(val+1==col)
                    {
                       // System.out.println(i+" "+j);
                        row1[inr]=i;
                        col1[inc]=j;
                        inr++;
                        inc++;
                    }
                    
                }

            }
            
            min++;
            col=col-min;
           
         }
        

         int rc=row1[0];
         int cr=col1[1];

         System.out.println("Output island:");
         for(int i=1;i<row;i++)
         {
            for(int j=1;j<rec;j++)
            {
                if(j<=cr)
                {
                    System.out.print(mat[i][j]+" ");
                }
            }
            if(i>=cr)
            {
                break;
            }
            System.out.println("\n");
           
         }
        
    }

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Row And Col :");
        int row=s.nextInt();
        int col=s.nextInt();

        int mat[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                mat[i][j]=s.nextInt();
            }
        }

        
        process(mat,row,col);

    }
}
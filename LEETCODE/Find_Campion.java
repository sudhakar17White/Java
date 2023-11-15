import java.util.HashMap;

public class Find_Campion {

    public static void main(String[] args) {
        int grid[][]={{0,0,1},{1,0,1},{0,0,0}};
        int ar[]=new int[grid.length];
        int in=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==1)
                {
                    in++;
                }
            }
            ar[i]=in;
            in=0;

        }
        int max=ar[0];
        int index=0;
        for(int i=1;i<ar.length;i++)
        {
            if(max<ar[i])
            {
                max=ar[i];
                index=i;
            }
        }
        System.out.println(max+" "+index);
        
    }
}

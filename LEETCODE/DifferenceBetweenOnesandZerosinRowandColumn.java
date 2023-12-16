
public class DifferenceBetweenOnesandZerosinRowandColumn {
    static int rowcol(int i,int j, int[][] grid)
    {
        int rone=0,cone=0,rzero=0,czero=0;
        System.out.println(i+" "+j);
        //rowise checking
        for(int in=0;in<grid.length;in++)
        {
            if(grid[i][in]==1)
            {
                rone++;
            }
            else
            {
                rzero++;
            }
        }
        System.out.println(rone+" "+rzero);
        
        for(int in=0;in<grid[0].length;in++)
        {
            if(grid[in][j]==1)
            {
                cone++;
            }
            else
            {
                czero++;
            }
        }
       
        //System.out.println(rone+" "+cone+" "+rzero+" "+czero);

        return ((rone+cone-rzero-czero));
    }
    public static void main(String[] args) {
        int grid[][] = {{1,1,1},{1,1,1}};
        System.out.println(grid.length+" "+grid[0].length);
        int dif[][]=new int[grid.length][grid[0].length];
        
        
        for(int i=0;i<grid.length;i++)
        {   
            for(int j=0;j<grid[0].length;j++)
            {
                dif[i][j]=(rowcol(i,j,grid));
            }
        }
        for(int i=0;i<dif.length;i++)
        {
            for(int j=0;j<dif[i].length;j++)
            {
                System.out.print(dif[i][j]+" ");
            }
            System.out.println();
        }

    }
}
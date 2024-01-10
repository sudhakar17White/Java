public class Searcha2DMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        boolean ans=false;
        a:
        for(int i=0;i<matrix.length;i++) 
        {
            for(int j=0;j<matrix[0].length;j++)
            {
               if(target==matrix[i][j])
               {
                    ans=true;
                    break a;
               }
            }
        }
        System.out.println(ans);
    }
}

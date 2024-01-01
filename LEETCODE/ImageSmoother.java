public class ImageSmoother {
    public static void main(String[] args) {
        int mat[][]={{100,200,100},{200,50,200},{100,200,100}};
        int zeroflo=((mat[0][0]+mat[0][2]+mat[2][0]+mat[2][2]));
        int firstflo=((mat[0][1]+mat[1][0]+mat[1][2]+mat[2][1]));
        int tot=0;
        for(int i=0;i<3;i++)
        {   
            for(int j=0;j<3;j++)
            {
                tot=tot+mat[i][j];
            }
        }
        tot=tot/9;
        System.out.println(zeroflo);
        System.out.println(firstflo);
        System.out.println(tot);

        
    }
}
